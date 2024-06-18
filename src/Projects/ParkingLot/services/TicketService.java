package Projects.ParkingLot.services;

import Projects.ParkingLot.exceptions.GateNotFoundException;
import Projects.ParkingLot.exceptions.ParkingLotNotFoundException;
import Projects.ParkingLot.exceptions.VehicleNotFoundException;
import Projects.ParkingLot.factory.SpotAssignmentStrategyFactory;
import Projects.ParkingLot.models.*;
import Projects.ParkingLot.repository.GateRepository;
import Projects.ParkingLot.repository.ParkingLotRepository;
import Projects.ParkingLot.repository.TicketRepository;
import Projects.ParkingLot.repository.VehicleRepository;
import Projects.ParkingLot.strategies.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType) throws GateNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        //Get the gate object from the gateId.
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Invalid gateId: " + gateId);
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        //Get the vehicle object with the vehicleNumber, if it is not present then save it to DB.
        Optional<Vehicle> optionalVehicle =
                vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle savedVehicle = null;

        if (optionalVehicle.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);

        //Assign the spot.
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gateId);
        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategyType();

        SpotAssignmentStrategy spotAssignmentStrategy =
                SpotAssignmentStrategyFactory.getSpotAssignmentStrategyForType(spotAssignmentStrategyType);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType, gate);
        ticket.setParkingSpot(parkingSpot);

        ticket.setNumber("TICKET_" + gateId + "_" + ticket.getEntryTime());

        return ticketRepository.save(ticket);
    }
}

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
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         TicketRepository ticketRepository,
                         ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType) throws GateNotFoundException, VehicleNotFoundException, ParkingLotNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // Get the gate object from the gate field
        Optional<Gate> optionalGate = gateRepository.getGateById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException();
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedGate(gate);

        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(vehicleNumber);
        Vehicle savedVehicle;

        if (optionalVehicle.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);

        Optional<ParkingLot> parkingLot = parkingLotRepository.getParkingLot(gateId);

        if (parkingLot.isEmpty()) {
            throw new ParkingLotNotFoundException();
        }

        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.get().getSpotAssignmentStrategyType();
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategyForType(spotAssignmentStrategyType);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType, gate);
        ticket.setParkingSpot(parkingSpot);

        ticket.setTicketNumber("TICKET_" + gateId + " " + ticket.getEntryTime());

        return ticketRepository.save(ticket);
    }

}

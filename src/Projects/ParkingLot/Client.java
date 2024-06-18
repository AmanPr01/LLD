package Projects.ParkingLot;

import Projects.ParkingLot.controllers.TicketController;
import Projects.ParkingLot.dtos.IssueTicketRequestDTO;
import Projects.ParkingLot.dtos.IssueTicketResponseDTO;
import Projects.ParkingLot.exceptions.GateNotFoundException;
import Projects.ParkingLot.exceptions.ParkingLotNotFoundException;
import Projects.ParkingLot.exceptions.VehicleNotFoundException;
import Projects.ParkingLot.models.Ticket;
import Projects.ParkingLot.models.VehicleType;
import Projects.ParkingLot.repository.GateRepository;
import Projects.ParkingLot.repository.ParkingLotRepository;
import Projects.ParkingLot.repository.TicketRepository;
import Projects.ParkingLot.repository.VehicleRepository;
import Projects.ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) throws VehicleNotFoundException, ParkingLotNotFoundException, GateNotFoundException {

        // Create a Ticket.
        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setGateId(1234L);
        requestDTO.setVehicleId("UP2020");
        requestDTO.setVehicleType(VehicleType.SUV);
        requestDTO.setOwnerName("Aman");

        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository,
                parkingLotRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(requestDTO);
        Ticket ticket = responseDTO.getTicket();
    }
}

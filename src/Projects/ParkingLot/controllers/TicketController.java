package Projects.ParkingLot.controllers;

import Projects.ParkingLot.dtos.IssueTicketRequestDTO;
import Projects.ParkingLot.dtos.IssueTicketResponseDTO;
import Projects.ParkingLot.dtos.ResponseStatus;
import Projects.ParkingLot.exceptions.GateNotFoundException;
import Projects.ParkingLot.exceptions.ParkingLotNotFoundException;
import Projects.ParkingLot.exceptions.VehicleNotFoundException;
import Projects.ParkingLot.models.Ticket;
import Projects.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) throws GateNotFoundException, VehicleNotFoundException, ParkingLotNotFoundException {
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(
                    requestDTO.getGateId(),
                    requestDTO.getVehicleId(),
                    requestDTO.getOwnerName(),
                    requestDTO.getVehicleType()
            );

            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (GateNotFoundException gateNotFoundException) {
            gateNotFoundException.getMessage();
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}

package Projects.ParkingLot.repository;

import Projects.ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private Long previousTicketId = 0L;

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == 0) {
            previousTicketId+=1;
            ticket.setId(previousTicketId);
            ticketMap.put(ticket.getId(), ticket);
        }
        ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }
}

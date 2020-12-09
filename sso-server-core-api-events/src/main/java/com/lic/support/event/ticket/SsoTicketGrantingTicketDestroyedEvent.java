package com.lic.support.event.ticket;

import com.lic.support.event.AbstractSsoEvent;
import com.lic.ticket.TicketGrantingTicket;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:04
 */
@ToString
public class SsoTicketGrantingTicketDestroyedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -3311026541592591816L;

    private final TicketGrantingTicket ticketGrantingTicket;

    public SsoTicketGrantingTicketDestroyedEvent(final Object source, final TicketGrantingTicket ticket) {
        super(source);
        this.ticketGrantingTicket = ticket;
    }

    public TicketGrantingTicket getTicketGrantingTicket() {
        return this.ticketGrantingTicket;
    }
}

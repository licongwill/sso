package com.lic.support.event.ticket;

import com.lic.sso.event.AbstractSsoEvent;
import com.lic.sso.ticket.TicketGrantingTicket;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:03
 */
@ToString
public class SsoTicketGrantingTicketCreatedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -6996849745003779165L;

    private final TicketGrantingTicket ticketGrantingTicket;

    public SsoTicketGrantingTicketCreatedEvent(final Object source, final TicketGrantingTicket ticketGrantingTicket) {
        super(source);
        this.ticketGrantingTicket = ticketGrantingTicket;
    }

    public TicketGrantingTicket getTicketGrantingTicket() {
        return this.ticketGrantingTicket;
    }
}

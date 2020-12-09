package com.lic.support.event.ticket;

import com.lic.support.event.AbstractSsoEvent;
import com.lic.ticket.TicketGrantingTicket;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:58
 */
@ToString
public class SsoProxyGrantingTicketCreatedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 5461784665986148705L;

    private final TicketGrantingTicket ticketGrantingTicket;

    public SsoProxyGrantingTicketCreatedEvent(final Object source, final TicketGrantingTicket ticketGrantingTicket) {
        super(source);
        this.ticketGrantingTicket = ticketGrantingTicket;
    }

    public TicketGrantingTicket getTicketGrantingTicket() {
        return this.ticketGrantingTicket;
    }
}

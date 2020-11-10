package com.lic.support.event.ticket;

import com.lic.sso.event.AbstractSsoEvent;
import com.lic.sso.ticket.ServiceTicket;
import com.lic.sso.ticket.TicketGrantingTicket;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:00
 */
@ToString
public class SsoServiceTicketGrantedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -2508732766395430066L;

    private final TicketGrantingTicket ticketGrantingTicket;

    private final ServiceTicket serviceTicket;

    public SsoServiceTicketGrantedEvent(final Object source, final TicketGrantingTicket ticketGrantingTicket, final ServiceTicket serviceTicket) {
        super(source);
        this.ticketGrantingTicket = ticketGrantingTicket;
        this.serviceTicket = serviceTicket;
    }

    public TicketGrantingTicket getTicketGrantingTicket() {
        return this.ticketGrantingTicket;
    }

    public ServiceTicket getServiceTicket() {
        return this.serviceTicket;
    }
}

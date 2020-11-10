package com.lic.support.event.ticket;

import com.lic.sso.event.AbstractSsoEvent;
import com.lic.sso.ticket.ServiceTicket;
import com.lic.sso.validation.Assertion;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:01
 */
@ToString
public class SsoServiceTicketValidatedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 2037609258655353306L;

    private final transient Assertion assertion;

    private final ServiceTicket serviceTicket;

    public SsoServiceTicketValidatedEvent(final Object source, final ServiceTicket serviceTicket, final Assertion assertion) {
        super(source);
        this.assertion = assertion;
        this.serviceTicket = serviceTicket;
    }

    public Assertion getAssertion() {
        return this.assertion;
    }

    public ServiceTicket getServiceTicket() {
        return this.serviceTicket;
    }
}

package com.lic.support.event.ticket;

import com.lic.support.event.AbstractSsoEvent;
import com.lic.ticket.proxy.ProxyGrantingTicket;
import com.lic.ticket.proxy.ProxyTicket;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:59
 */
@ToString
public class SsoProxyTicketGrantedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -4251230073562670427L;

    private final ProxyGrantingTicket proxyGrantingTicket;

    private final ProxyTicket proxyTicket;

    public SsoProxyTicketGrantedEvent(final Object source, final ProxyGrantingTicket proxyGrantingTicket, final ProxyTicket proxyTicket) {
        super(source);
        this.proxyGrantingTicket = proxyGrantingTicket;
        this.proxyTicket = proxyTicket;
    }

    public ProxyGrantingTicket getProxyGrantingTicket() {
        return this.proxyGrantingTicket;
    }

    public ProxyTicket getProxyTicket() {
        return this.proxyTicket;
    }
}

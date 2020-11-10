package com.lic.ticket.proxy;


import com.lic.authentication.principal.Service;
import com.lic.ticket.ExpirationPolicy;
import com.lic.ticket.TicketGrantingTicket;

public interface ProxyGrantingTicket extends TicketGrantingTicket {
    String PROXY_GRANTING_TICKET_PREFIX = "PGT";

    String PROXY_GRANTING_TICKET_IOU_PREFIX = "PGTIOU";

    /**
     * 授权代理票据
     * @param id
     * @param service
     * @param expirationPolicy
     * @param onlyTrackMostRecentSession
     * @return
     */
    ProxyTicket grantProxyTicket(String id, Service service, ExpirationPolicy expirationPolicy, boolean onlyTrackMostRecentSession);
}

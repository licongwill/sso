package com.lic.ticket;


import com.lic.authentication.Authentication;
import com.lic.authentication.principal.Service;
import com.lic.ticket.proxy.ProxyGrantingTicket;

public interface ServiceTicket extends Ticket {

    String PREFIX = "ST";

    /**
     * get service
     * @return
     */
    Service getService();

    boolean isFromLogin();

    boolean isValidFor();

    ProxyGrantingTicket grantProxyGrantingTicket(String id, Authentication authentication, ExpirationPolicy expirationPolicy);
}

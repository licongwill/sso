package com.lic.sso.ticket;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.principal.Service;
import com.lic.sso.ticket.proxy.ProxyGrantingTicket;

public interface ServiceTicket extends Ticket {

    String PREFIX = "ST";

    /**
     * get service
     * @return
     */
    Service getService();

    boolean isFromLogin();

    boolean isValidFor();

    ProxyGrantingTicket grantProxyGrantingTicket(String id, Authentication authentication,ExpirationPolicy expirationPolicy);
}

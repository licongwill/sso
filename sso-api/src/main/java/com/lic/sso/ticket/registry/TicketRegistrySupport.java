package com.lic.sso.ticket.registry;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.principal.Principal;

import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:15
 */
public interface TicketRegistrySupport {

    /**
     * get authentication
     * @param ticketGrantingTicketId
     * @return
     */
    Authentication getAuthentication(String ticketGrantingTicketId);

    /**
     * get principal
     * @param ticketGrantingTicketId
     * @return
     */
    Principal getAuthenticatedPrincipalFrom(String ticketGrantingTicketId);


    /**
     * get principal attributes
     * @param ticketGrantingTicketId
     * @return
     */
    Map<String,Object> getPrincipalAttributesFrom(String ticketGrantingTicketId);


    /**
     * 修改 authentication
     * @param ticketGrantingTicketId
     * @param authentication
     */
    void updateAuthentication(String ticketGrantingTicketId,Authentication authentication);
}

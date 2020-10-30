package com.lic.sso.audit;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.AuthenticationResult;
import com.lic.sso.authentication.principal.Service;
import com.lic.sso.services.RegisteredService;
import com.lic.sso.ticket.ServiceTicket;
import com.lic.sso.ticket.TicketGrantingTicket;
import lombok.Builder;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/30 11:38
 */
@Builder
public class AuditableContext {
    /**
     * service
     */
    private Service service;

    /**
     * registerService
     */
    private RegisteredService registeredService;

    /**
     * authentiation
     */
    private Authentication authentication;

    /**
     * serviceTicket
     */
    private ServiceTicket serviceTicket;

    /**
     * authenticationResult
     */
    private AuthenticationResult authenticationResult;

    /**
     * TGT
     */
    private TicketGrantingTicket ticketGrantingTicket;

    /**
     * httpRequest
     */
    private Object httpRequest;

    /**
     * httpResponse
     */
    private Object httpResponse;

    @Builder.Default
    private Boolean retrievePrincipalAttributesFromReleasePolicy = Boolean.FALSE;
}

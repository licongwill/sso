package com.lic.audit;

import com.lic.authentication.Authentication;
import com.lic.authentication.AuthenticationResult;
import com.lic.authentication.principal.Service;
import com.lic.services.RegisteredService;
import com.lic.ticket.ServiceTicket;
import com.lic.ticket.TicketGrantingTicket;
import lombok.Builder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

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

    /**
     * 检索主体属性
     */
    @Builder.Default
    private Boolean retrievePrincipalAttributesFromReleasePolicy = Boolean.FALSE;

    /**
     * 属性
     */
    @Builder.Default
    private Map<String,Object> properties = new LinkedHashMap<>();

    /**
     * get service
     * @return
     */
    public Optional<Service> getService(){return Optional.ofNullable(service);}


    /**
     * get registered service
     * @return
     */
    public Optional<RegisteredService> getRegisteredService(){return Optional.ofNullable(registeredService);}


    /**
     * get authentication
     * @return
     */
    public Optional<Authentication> getAuthentication(){return Optional.ofNullable(authentication);}


    /**
     * get service ticket
     * @return
     */
    public Optional<ServiceTicket> getServiceTicket(){return Optional.ofNullable(serviceTicket);}

    /**
     * get request
     * @return
     */
    public Optional<Object> getRequest(){return Optional.ofNullable(httpRequest);}


    /**
     * get responce
     * @return
     */
    public Optional<Object> getResponse(){return Optional.ofNullable(httpResponse);}

    /**
     * get authentication result
     * @return
     */
    public Optional<AuthenticationResult> getAuthenticationResult(){return Optional.ofNullable(authenticationResult);}


    /**
     * get TGT
     * @return
     */
    public Optional<TicketGrantingTicket> getTicketGrantingTicket(){return Optional.ofNullable(ticketGrantingTicket);}


    /**
     * get properties
     * @return
     */
    public Map<String,Object> getProperties(){return properties;}
}

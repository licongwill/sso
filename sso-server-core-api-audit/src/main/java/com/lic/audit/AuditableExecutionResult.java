package com.lic.audit;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.AuthenticationResult;
import com.lic.sso.authentication.principal.Service;
import com.lic.sso.services.RegisteredService;
import com.lic.sso.ticket.ServiceTicket;
import com.lic.sso.ticket.TicketGrantingTicket;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/30 14:35
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditableExecutionResult {
    /**
     * registered service
     */
    private RegisteredService registeredService;

    /**
     * service
     */
    private Service service;

    /**
     * service ticket
     */
    private ServiceTicket serviceTicket;


    /**
     * authentication
     */
    private Authentication authentication;

    /**
     * runtimeException
     */
    @Setter
    private RuntimeException runtimeException;

    /**
     * executionResult
     */
    @Setter
    private Object executionResult;

    /**
     * TGT
     */
    private TicketGrantingTicket ticketGrantingTicket;

    /**
     * authenticationResult
     */
    private AuthenticationResult authenticationResult;

    @Builder.Default
    private Map<String,Object> properties = new TreeMap<>();

    /**
     * @Description: of
     * @Author licong
     * @date 2020/11/5 20:20
     */
    public static AuditableExecutionResult of(final AuditableContext context){
        val builder = AuditableExecutionResult.builder();
        if(context.getTicketGrantingTicket().isPresent()){
            builder.ticketGrantingTicket(context.getTicketGrantingTicket().get());
        }
        if(context.getAuthentication().isPresent()){
            builder.authentication(context.getAuthentication().get());
        }

        if(context.getAuthenticationResult().isPresent()){
            builder.authenticationResult(context.getAuthenticationResult().get());
        }

        if(context.getRegisteredService().isPresent()){
            builder.registeredService(context.getRegisteredService().get());
        }

        if(context.getService().isPresent()){
            builder.service(context.getService().get());
        }

        if(context.getServiceTicket().isPresent()){
            builder.serviceTicket(context.getServiceTicket().get());
        }
        builder.properties(context.getProperties());
        return builder.build();
    }

    public boolean isExecutionFailure(){
        return getException().isPresent();
    }

    public void throwExceptionIfNeed(){
        if(isExecutionFailure()){
            throw getException().get();
        }
    }

    /**
     * addProperty
     * @param name
     * @param value
     */
    public void addProperty(final String name,final Object value){
        this.properties.put(name,value);
    }

    /**
     * get registeredService
     * @return
     */
    public Optional<RegisteredService> getRegisteredService(){return Optional.ofNullable(registeredService);}

    /**
     * get serviceTicket
     * @return
     */
    public Optional<ServiceTicket> getServiceTicket(){return Optional.ofNullable(serviceTicket);}

    /**
     * get executionResult
     * @return
     */
    public Optional<Object> getExecutionResult(){return Optional.ofNullable(executionResult);}

    /**
     * get authentication
     * @return
     */
    public Optional<Authentication> getAuthentication(){return Optional.ofNullable(authentication);}

    /**
     * get TGT
     * @return
     */
    public Optional<TicketGrantingTicket> getTicketGrantingTicket(){return Optional.ofNullable(ticketGrantingTicket);}

    /**
     * get authentication result
     * @return
     */
    public Optional<AuthenticationResult> getAuthenticationResult(){return Optional.ofNullable(authenticationResult);}


    /**
     * get exception
     * @return
     */
    public Optional<RuntimeException> getException(){return Optional.ofNullable(runtimeException);}

    /**
     * get properties
     * @return
     */
    public Map<String,Object> getProperties(){return properties;}
}

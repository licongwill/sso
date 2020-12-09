package com.lic.support.event.authentication.adaptive;

import com.lic.authentication.Authentication;
import com.lic.services.RegisteredService;
import com.lic.support.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 16:05
 */
public class SsoRiskyAuthenticationMitigatedEvent extends AbstractSsoEvent {


    private static final long serialVersionUID = 2745930475356506772L;

    private final Authentication authentication;
    private final RegisteredService service;
    private final Object response;

    public SsoRiskyAuthenticationMitigatedEvent(final Object source, final Authentication authentication,
                                                final RegisteredService service, final Object response) {
        super(source);
        this.authentication = authentication;
        this.service = service;
        this.response = response;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public RegisteredService getService() {
        return service;
    }

    public Object getResponse() {
        return response;
    }
}

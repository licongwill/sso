package com.lic.sso.event.authentication.adaptive;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.event.AbstractSsoEvent;
import com.lic.sso.services.RegisteredService;

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

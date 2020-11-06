package com.lic.sso.event.authentication.adaptive;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.event.AbstractSsoEvent;
import com.lic.sso.services.RegisteredService;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:58
 */
public class SsoRiskBasedAuthenticationEvaluationStartedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -1053577364575621034L;

    private final Authentication authentication;
    private final RegisteredService service;

    public SsoRiskBasedAuthenticationEvaluationStartedEvent(final Object source,
                                                            final Authentication authentication,
                                                            final RegisteredService service) {
        super(source);
        this.authentication = authentication;
        this.service = service;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public RegisteredService getService() {
        return service;
    }
}

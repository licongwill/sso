package com.lic.support.event.authentication.adaptive;

import com.lic.authentication.Authentication;
import com.lic.services.RegisteredService;
import com.lic.support.event.AbstractSsoEvent;

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

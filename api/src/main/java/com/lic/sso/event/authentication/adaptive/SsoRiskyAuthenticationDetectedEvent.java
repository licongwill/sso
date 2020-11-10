package com.lic.sso.event.authentication.adaptive;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.event.AbstractSsoEvent;
import com.lic.sso.services.RegisteredService;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 12:02
 */
public class SsoRiskyAuthenticationDetectedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -2169801973017128382L;

    private final Authentication authentication;

    private final RegisteredService registeredService;

    private final Object score;

    public SsoRiskyAuthenticationDetectedEvent(final Object source, final Authentication authentication,
                                               final RegisteredService service,
                                               final Object riskScore) {
        super(source);
        this.authentication = authentication;
        this.registeredService = service;
        this.score = riskScore;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public RegisteredService getRegisteredService() {
        return registeredService;
    }

    public Object getScore() {
        return score;
    }
}

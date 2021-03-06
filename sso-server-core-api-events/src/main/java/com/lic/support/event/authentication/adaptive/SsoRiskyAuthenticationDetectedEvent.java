package com.lic.support.event.authentication.adaptive;

import com.lic.authentication.Authentication;
import com.lic.services.RegisteredService;
import com.lic.support.event.AbstractSsoEvent;

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

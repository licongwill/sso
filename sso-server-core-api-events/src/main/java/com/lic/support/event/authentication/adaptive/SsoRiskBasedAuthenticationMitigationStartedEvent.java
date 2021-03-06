package com.lic.support.event.authentication.adaptive;

import com.lic.authentication.Authentication;
import com.lic.services.RegisteredService;
import com.lic.support.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 12:00
 */
public class SsoRiskBasedAuthenticationMitigationStartedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 3536003622015084707L;

    private final Authentication authentication;
    private final RegisteredService service;
    private final Object score;

    public SsoRiskBasedAuthenticationMitigationStartedEvent(final Object source, final Authentication authentication,
                                                            final RegisteredService service, final Object score) {
        super(source);
        this.authentication = authentication;
        this.service = service;
        this.score = score;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public RegisteredService getService() {
        return service;
    }

    public Object getScore() {
        return score;
    }
}

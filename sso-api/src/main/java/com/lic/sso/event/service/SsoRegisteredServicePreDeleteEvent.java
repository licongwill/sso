package com.lic.sso.event.service;

import com.lic.sso.services.RegisteredService;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:44
 */
@ToString
public class SsoRegisteredServicePreDeleteEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = 394438517238132273L;

    private final RegisteredService registeredService;

    public SsoRegisteredServicePreDeleteEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}

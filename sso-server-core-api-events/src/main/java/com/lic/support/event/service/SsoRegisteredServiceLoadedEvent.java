package com.lic.support.event.service;

import com.lic.sso.services.RegisteredService;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:43
 */
@ToString
public class SsoRegisteredServiceLoadedEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = -6460279565834699516L;

    private final RegisteredService registeredService;

    public SsoRegisteredServiceLoadedEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}

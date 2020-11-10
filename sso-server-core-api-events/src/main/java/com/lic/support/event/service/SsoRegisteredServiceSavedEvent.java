package com.lic.support.event.service;

import com.lic.sso.services.RegisteredService;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:46
 */
@ToString
public class SsoRegisteredServiceSavedEvent extends BaseSsoRegisteredServiceEvent{
    private static final long serialVersionUID = 3108281770689970784L;

    private final RegisteredService registeredService;

    public SsoRegisteredServiceSavedEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}

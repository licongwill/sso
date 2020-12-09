package com.lic.support.event.service;

import com.lic.services.RegisteredService;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:45
 */
@ToString
public class SsoRegisteredServicePreSaveEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = 1295325530082353053L;

    private final RegisteredService registeredService;

    public SsoRegisteredServicePreSaveEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}

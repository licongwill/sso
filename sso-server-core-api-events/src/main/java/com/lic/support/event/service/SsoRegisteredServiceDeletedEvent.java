package com.lic.support.event.service;

import com.lic.services.RegisteredService;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:41
 */
@ToString
public class SsoRegisteredServiceDeletedEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = 1367393637531845720L;

    private final RegisteredService registeredService;

    public SsoRegisteredServiceDeletedEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}

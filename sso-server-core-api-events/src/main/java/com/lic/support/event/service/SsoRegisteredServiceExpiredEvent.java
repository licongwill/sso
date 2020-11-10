package com.lic.support.event.service;

import com.lic.sso.services.RegisteredService;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:43
 */
@ToString
public class SsoRegisteredServiceExpiredEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = -7537620654111751469L;

    private final RegisteredService registeredService;

    public SsoRegisteredServiceExpiredEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}

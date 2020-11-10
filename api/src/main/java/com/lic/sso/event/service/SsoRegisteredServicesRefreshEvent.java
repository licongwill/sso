package com.lic.sso.event.service;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:56
 */

public class SsoRegisteredServicesRefreshEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = -333094480255846595L;

    public SsoRegisteredServicesRefreshEvent(final Object source) {
        super(source);
    }
}

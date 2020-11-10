package com.lic.support.event.service;

import com.lic.sso.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:40
 */
public class BaseSsoRegisteredServiceEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 7316644815075544045L;

    public BaseSsoRegisteredServiceEvent(final Object source) {
        super(source);
    }
}

package com.lic.support.event.service;

import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:48
 */
@ToString
public class SsoRegisteredServicesDeletedEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = 6452925879688806815L;

    public SsoRegisteredServicesDeletedEvent(final Object source) {
        super(source);
    }
}

package com.lic.support.event.authentication;

import com.lic.authentication.Authentication;
import com.lic.support.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:31
 */
public class SsoAuthenticationTransactionCompletedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -777207796116692208L;

    private final Authentication authentication;

    public SsoAuthenticationTransactionCompletedEvent(final Object source, final Authentication authentication) {
        super(source);
        this.authentication = authentication;
    }

    public Authentication getAuthentication() {
        return authentication;
    }
}

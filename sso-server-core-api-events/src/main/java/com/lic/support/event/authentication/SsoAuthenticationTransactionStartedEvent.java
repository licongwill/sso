package com.lic.support.event.authentication;

import com.lic.sso.authentication.Credential;
import com.lic.sso.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:32
 */
public class SsoAuthenticationTransactionStartedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -7232243756274649203L;

    private final Credential credential;

    public SsoAuthenticationTransactionStartedEvent(final Object source, final Credential c) {
        super(source);
        this.credential = c;
    }

    public Credential getCredential() {
        return credential;
    }

}

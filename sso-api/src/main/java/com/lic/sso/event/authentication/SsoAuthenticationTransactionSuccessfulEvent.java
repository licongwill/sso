package com.lic.sso.event.authentication;

import com.lic.sso.authentication.Credential;
import com.lic.sso.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:33
 */
public class SsoAuthenticationTransactionSuccessfulEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 2472162675640300536L;

    private final Credential credential;

    public SsoAuthenticationTransactionSuccessfulEvent(final Object source, final Credential c) {
        super(source);
        this.credential = c;
    }

    public Credential getCredential() {
        return credential;
    }
}

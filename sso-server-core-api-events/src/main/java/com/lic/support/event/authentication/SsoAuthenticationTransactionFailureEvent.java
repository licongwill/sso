package com.lic.support.event.authentication;

import com.lic.sso.authentication.Credential;
import com.lic.sso.event.AbstractSsoEvent;
import lombok.Getter;

import java.util.Collection;
import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 16:15
 */
@Getter
public class SsoAuthenticationTransactionFailureEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -1182276760570930514L;

    private final Map<String, Throwable> failures;

    private final Collection<Credential> credential;

    public SsoAuthenticationTransactionFailureEvent(final Object source, final Map<String, Throwable> failures,
                                                    final Collection<Credential> credential) {
        super(source);
        this.failures = failures;
        this.credential = credential;
    }

    public Credential getCredential() {
        return credential.iterator().next();
    }
}

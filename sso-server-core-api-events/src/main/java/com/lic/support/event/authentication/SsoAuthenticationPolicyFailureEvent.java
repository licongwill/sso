package com.lic.support.event.authentication;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.AuthenticationTransaction;
import lombok.Getter;

import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 16:14
 */
@Getter
public class SsoAuthenticationPolicyFailureEvent extends SsoAuthenticationTransactionFailureEvent {
    private static final long serialVersionUID = 7798978219116532920L;

    private final Authentication authentication;

    public SsoAuthenticationPolicyFailureEvent(final Object source,
                                               final Map<String, Throwable> failures,
                                               final AuthenticationTransaction transaction,
                                               final Authentication authentication) {
        super(source, failures, transaction.getCredentials());
        this.authentication = authentication;
    }
}

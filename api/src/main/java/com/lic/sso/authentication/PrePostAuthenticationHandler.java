package com.lic.sso.authentication;

import java.security.GeneralSecurityException;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/28 20:47
 */
@FunctionalInterface
public interface PrePostAuthenticationHandler extends AuthenticationHandler {

    /**
     * 认证前置处理
     * @param credential
     * @return
     */
    default boolean preAuthenticate(final Credential credential){return true;}


    default AuthenticationHandlerExecutionResult postAuthenticate(final Credential credential,final AuthenticationHandlerExecutionResult result) {
        return result;
    }
}

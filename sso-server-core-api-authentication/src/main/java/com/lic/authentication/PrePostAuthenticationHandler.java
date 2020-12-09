package com.lic.authentication;

@FunctionalInterface
public interface PrePostAuthenticationHandler extends AuthenticationHandler {

    /**
     * 认证前置处理
     * @param credential
     * @return
     */
    default boolean preAuthenticate(final Credential credential){return true;}


    default AuthenticationHandlerExecutionResult postAuthenticate(final Credential credential, final AuthenticationHandlerExecutionResult result) {
        return result;
    }
}

package com.lic.authentication;

import java.util.Map;

public class PrincipalException extends AuthenticationException {
    private static final long serialVersionUID = -2325904408491296252L;

    private static final String CODE = "service.principal.resolution.error";

    public PrincipalException(
            final String message,
            final Map<String, Throwable> handlerErrors,
            final Map<String, AuthenticationHandlerExecutionResult> handlerSuccesses) {
        super(message, handlerErrors, handlerSuccesses);
    }
}

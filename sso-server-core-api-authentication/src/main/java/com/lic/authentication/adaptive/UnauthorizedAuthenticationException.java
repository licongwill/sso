package com.lic.authentication.adaptive;


import com.lic.authentication.AuthenticationException;
import com.lic.authentication.AuthenticationHandlerExecutionResult;

import java.util.HashMap;
import java.util.Map;


public class UnauthorizedAuthenticationException extends AuthenticationException {

    public UnauthorizedAuthenticationException(final String message, final Map<String, Throwable> handlerErrors) {
        super(message, handlerErrors, new HashMap<>(0));
    }

    public UnauthorizedAuthenticationException(final Map<String, Throwable> handlerErrors) {
        super(handlerErrors);
    }

    public UnauthorizedAuthenticationException(final Map<String, Throwable> handlerErrors, final Map<String, AuthenticationHandlerExecutionResult> handlerSuccesses) {
        super(handlerErrors, handlerSuccesses);
    }

    public UnauthorizedAuthenticationException(final String message,
                                               final Map<String, Throwable> handlerErrors,
                                               final Map<String, AuthenticationHandlerExecutionResult> handlerSuccesses) {
        super(message, handlerErrors, handlerSuccesses);
    }
}

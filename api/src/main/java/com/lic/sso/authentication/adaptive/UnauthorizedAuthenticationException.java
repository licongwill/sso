package com.lic.sso.authentication.adaptive;

import com.lic.sso.authentication.AuthenticationException;
import com.lic.sso.authentication.AuthenticationHandlerExecutionResult;
import com.lic.sso.authentication.HandlerResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:25
 */
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

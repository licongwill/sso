package com.lic.sso.authentication.adaptive;

import com.lic.sso.authentication.AuthenticationException;
import com.lic.sso.authentication.HandlerResult;

import java.util.Collections;
import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:25
 */
public class UnauthorizedAuthenticationException extends AuthenticationException {

    public UnauthorizedAuthenticationException(final String message, final Map<String, Class<? extends Exception>> handlerErrors) {
        super(message, handlerErrors, Collections.emptyMap());
    }

    public UnauthorizedAuthenticationException(final Map<String, Class<? extends Exception>> handlerErrors) {
        super(handlerErrors);
    }

    public UnauthorizedAuthenticationException(final Map<String, Class<? extends Exception>> handlerErrors, final Map<String, HandlerResult> handlerSuccesses) {
        super(handlerErrors, handlerSuccesses);
    }

    public UnauthorizedAuthenticationException(final String message,
                                               final Map<String, Class<? extends Exception>> handlerErrors,
                                               final Map<String, HandlerResult> handlerSuccesses) {
        super(message, handlerErrors, handlerSuccesses);
    }
}

package com.lic.authentication;

import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/28 20:51
 */
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

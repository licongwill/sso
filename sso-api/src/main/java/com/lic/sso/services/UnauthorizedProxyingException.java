package com.lic.sso.services;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/30 11:33
 */
public class UnauthorizedProxyingException extends  UnauthorizedServiceException {

    public static final String CODE = "UNAUTHORIZED_SERVICE_PROXY";

    public static final String MESSAGE = "Proxying is not allowed for registered service ";

    private static final long serialVersionUID = -336613696476720254L;

    public UnauthorizedProxyingException() {
        super(CODE);
    }

    public UnauthorizedProxyingException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UnauthorizedProxyingException(final String message) {
        super(message);
    }
}

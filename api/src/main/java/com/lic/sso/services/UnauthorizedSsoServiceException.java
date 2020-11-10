package com.lic.sso.services;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/30 11:35
 */
public class UnauthorizedSsoServiceException extends UnauthorizedServiceException {
    private static final long serialVersionUID = 6396014612207791809L;

    private static final String CODE = "service.not.authorized.sso";

    public UnauthorizedSsoServiceException() {
        this(CODE);
    }

    public UnauthorizedSsoServiceException(final String message,
                                           final Throwable cause) {
        super(message, cause);
    }

    public UnauthorizedSsoServiceException(final String message) {
        super(message);
    }
}

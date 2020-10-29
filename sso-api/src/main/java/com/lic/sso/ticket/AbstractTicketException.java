package com.lic.sso.ticket;

import com.lic.sso.authentication.RootCasException;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:23
 */
public abstract class AbstractTicketException extends RootCasException {
    private static final long serialVersionUID = -5593468712846911493L;

    public AbstractTicketException(final String code, final Throwable throwable) {
        super(code, throwable);
    }

    public AbstractTicketException(final String code) {
        super(code);
    }

    public AbstractTicketException(final String code, final String msg) {
        super(code, msg);
    }
}

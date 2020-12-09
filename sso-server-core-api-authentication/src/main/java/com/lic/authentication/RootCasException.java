package com.lic.authentication;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.val;

@ToString
@RequiredArgsConstructor
public abstract class RootCasException extends RuntimeException {

    private static final long serialVersionUID = -2884317086554677496L;

    private final String code;


    public RootCasException(final String code, final String msg) {
        super(msg);
        this.code = code;
    }

    public RootCasException(final String code, final Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public String getCode() {
        val cause = this.getCause();
        if (cause instanceof RootCasException) {
            return ((RootCasException) cause).getCode();
        }
        return this.code;
    }
}

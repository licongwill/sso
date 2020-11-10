package com.lic.sso.services;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:50
 */
@Getter
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "Unauthorized Service Usage")
public class UnauthorizedServiceException extends RuntimeException {

    public static final String CODE_UNAUTHZ_NAME = "screen.service.error.message";

    public static final String CODE_EMPTY_SYC_MGMR = "screen.service.empty.error.message";

    public static final String CODE_EXPIRE_SERVICE = "screen.service.expired.message";

    private static final long serialVersionUID = 1171083081465767815L;

    private final String code;

    public UnauthorizedServiceException(final String message) {
        this(null, message);
    }

    public UnauthorizedServiceException(final String code,final String message){
        super(message);
        this.code = code;
    }

    public UnauthorizedServiceException(final String message, final Throwable cause) {
        super(message, cause);
        this.code = null;
    }
}

package com.lic.sso.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:50
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class UnauthorizedServiceException {
}

package com.lic.services;

import lombok.Getter;

import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/30 11:30
 */
@Getter
public class UnauthorizedServiceForPrincipalException extends UnauthorizedServiceException {
    private static final long serialVersionUID = -2124441884789830365L;

    private static final String  CODE = "service.not.authorized.missing.attr";

    private final RegisteredService registeredService;

    private final String principalId;

    private final Map<String,Object> attributes;


    public UnauthorizedServiceForPrincipalException(final String message, final RegisteredService registeredService,
                                                    final String principalId, final Map<String, Object> attributes) {
        super(CODE, message);
        this.registeredService = registeredService;
        this.principalId = principalId;
        this.attributes = attributes;
    }
}

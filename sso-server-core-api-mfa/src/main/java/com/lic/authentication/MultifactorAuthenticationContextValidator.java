package com.lic.authentication;

import com.lic.services.RegisteredService;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Optional;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:50
 */
@FunctionalInterface
public interface MultifactorAuthenticationContextValidator {
    Pair<Boolean, Optional<MultifactorAuthenticationProvider>> validate(Authentication authentication,
                                                                        String requestedContext,
                                                                        RegisteredService service);
}

package com.lic.authentication;

import com.lic.authentication.principal.Service;
import com.lic.services.RegisteredService;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 11:10
 */
@FunctionalInterface
public interface MultifactorAuthenticationTriggerSelectionStrategy {

    Optional<String> resolve(HttpServletRequest request,
                             RegisteredService registeredService,
                             Authentication authentication,
                             Service service);
}

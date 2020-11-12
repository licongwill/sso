package com.lic.authentication;

import com.lic.authentication.principal.Service;
import com.lic.services.RegisteredService;
import org.springframework.core.Ordered;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 11:09
 */
public interface MultifactorAuthenticationTrigger extends Ordered {
    Optional<MultifactorAuthenticationProvider> isActivated(Authentication authentication,
                                                            RegisteredService registeredService,
                                                            HttpServletRequest httpServletRequest,
                                                            Service service);

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

package com.lic.authentication;

import com.lic.services.RegisteredService;
import com.lic.services.RegisteredServiceMultifactorPolicy;
import org.springframework.core.Ordered;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:45
 */
@FunctionalInterface
public interface MultifactorAuthenticationFailureModeEvaluator extends Serializable,Ordered {

    RegisteredServiceMultifactorPolicy.FailureModes evaluate(RegisteredService registeredService,
                                                             MultifactorAuthenticationProvider provider);

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

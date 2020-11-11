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
 * @date 2020/11/9 20:39
 */
public interface MultifactorAuthenticationProvider extends Serializable,Ordered {

    boolean isAvailable(RegisteredService registeredService) throws AuthenticationException;

    MultifactorAuthenticationProviderBypass getBypassEvaluator();

    MultifactorAuthenticationFailureModeEvaluator getFailureModeEvaluator();

    String getId();

    String getFriendlyName();

    boolean matches(String identifier);

    RegisteredServiceMultifactorPolicy.FailureModes failureMode();

    default String createUniqueId() {
        return getId().concat(String.valueOf(hashCode()));
    }

    default boolean validateId(final String id) {
        return id != null && createUniqueId().equals(id);
    }
}

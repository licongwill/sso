package com.lic.authentication;

import com.lic.services.RegisteredService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 10:52
 */
@FunctionalInterface
public interface MultifactorAuthenticationProviderResolver extends Serializable,Ordered {
    Logger LOGGER = LoggerFactory.getLogger(MultifactorAuthenticationProviderResolver.class);

    default String getName() {
        return getClass().getName();
    }

    Set<Event> resolveEventViaAuthenticationAttribute(Authentication authentication,
                                                      Collection<String> attributeNames,
                                                      RegisteredService service,
                                                      Optional<RequestContext> context,
                                                      Collection<MultifactorAuthenticationProvider> providers,
                                                      Predicate<String> predicate);

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

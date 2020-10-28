package com.lic.sso.authentication;

import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

import java.util.Set;
import java.util.stream.Collectors;

public interface AuthenticationHandlerResolver extends Ordered {

    Logger LOGGER = LoggerFactory.getLogger(AuthenticationHandlerResolver.class);

    @Override
    default int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    /**
     * 解析认证处理器
     * @param candidateHandlers
     * @param transaction
     * @return
     */
    default Set<AuthenticationHandler> resolve(final Set<AuthenticationHandler> candidateHandlers, final AuthenticationTransaction transaction) {
        val handlers = candidateHandlers.stream().map(AuthenticationHandler::getName).collect(Collectors.joining(","));
        LOGGER.debug("Default authentication handlers used for this transaction are [{}]", handlers);
        return candidateHandlers;
    }

    /**
     * 是否支持transaction
     * @param handlers
     * @param transaction
     * @return
     */
    default boolean supports(final Set<AuthenticationHandler> handlers, final AuthenticationTransaction transaction) {
        return !handlers.isEmpty() && transaction != null;
    }
}

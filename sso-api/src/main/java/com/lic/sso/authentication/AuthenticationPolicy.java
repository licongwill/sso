package com.lic.sso.authentication;

import org.springframework.core.Ordered;

import java.util.Set;

@FunctionalInterface
public interface AuthenticationPolicy extends Ordered {
    /**
     * 是否满足认证策略
     * @param authentication
     * @param authenticationHandlers
     * @return
     * @throws Exception
     */
    boolean isSatisfiedBy(Authentication authentication, Set<AuthenticationHandler> authenticationHandlers) throws Exception;

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

}

package com.lic.authentication;

import org.springframework.core.Ordered;

@FunctionalInterface
public interface AuthenticationPostProcessor extends Ordered{
    @Override
    default int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    /**
     * 处理认证事件
     * @param builder
     * @param transaction
     * @throws AuthenticationException
     */
    void process(AuthenticationBuilder builder, AuthenticationTransaction transaction) throws AuthenticationException;

    /**
     * 是否支持给定凭证
     * @param credential
     * @return
     */
    default boolean supports(final Credential credential) {
        return true;
    }
}

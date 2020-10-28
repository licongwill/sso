package com.lic.sso.authentication;

import org.springframework.core.Ordered;

public interface AuthenticationPreProcessor extends Ordered {
    @Override
    default int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    /**
     * 处理认证事件
     * @param transaction
     * @return
     * @throws AuthenticationException
     */
    boolean process(AuthenticationTransaction transaction) throws AuthenticationException;

    /**
     * 是否支持给定凭证
     * @param credential
     * @return
     */
    default boolean supports(final Credential credential) {
        return true;
    }
}

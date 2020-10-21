package com.lic.authentication;

import org.springframework.core.Ordered;

public interface AuthenticationMetaDataPopulator extends Ordered {
    /**
     * 在成功认证给定凭证时
     * 增加authentication metadata attributes
     * @param builder
     * @param transaction
     */
    void populateAttributes(AuthenticationBuilder builder,AuthenticationTransaction transaction);

    /**
     * 是否支持给定凭证
     * @param credential
     * @return
     */
    boolean supports(Credential credential);


    @Override
    default int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}

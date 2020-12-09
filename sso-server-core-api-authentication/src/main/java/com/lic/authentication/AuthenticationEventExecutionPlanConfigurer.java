package com.lic.authentication;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.Ordered;


@FunctionalInterface
public interface AuthenticationEventExecutionPlanConfigurer extends Ordered {
    /**
     * 配置 执行计划
     * @param plan
     */
    void configureAuthenticationEventExecutionPlan(AuthenticationEventExecutionPlan plan);

    /**
     * Gets name.
     *
     * @return the name
     */
    default String getName() {
        return StringUtils.defaultIfBlank(this.getClass().getSimpleName(), "Default");
    }

    @Override
    default int getOrder() {
        return 0;
    }
}

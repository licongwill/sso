package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 11:08
 */
@FunctionalInterface
public interface AuthenticationServiceSelectionStrategyConfigurer {
    void configureAuthenticationServiceSelectionStrategy(AuthenticationServiceSelectionPlan plan);
}

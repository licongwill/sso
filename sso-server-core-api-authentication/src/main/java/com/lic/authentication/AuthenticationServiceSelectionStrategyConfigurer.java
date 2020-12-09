package com.lic.authentication;

@FunctionalInterface
public interface AuthenticationServiceSelectionStrategyConfigurer {
    void configureAuthenticationServiceSelectionStrategy(AuthenticationServiceSelectionPlan plan);
}

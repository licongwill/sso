package com.lic.authentication;

public interface AuthenticationEventExecutionPlan {
    /**
     * 注册authenticationHandler
     * @param authenticationHandler
     */
    void registerAuthenticationHandler(AuthenticationHandler authenticationHandler);
}

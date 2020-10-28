package com.lic.sso.authentication;

import javax.security.auth.login.LoginException;
import java.util.List;

@FunctionalInterface
public interface AuthenticationAccountStateHandler<AuthnResponse,Configuration> {
    /**
     * 处理账户状态
     * @param authnResponse
     * @param configuration
     * @return
     */
    List<MessageDescriptor> handle(AuthnResponse authnResponse, Configuration configuration) throws LoginException;
}

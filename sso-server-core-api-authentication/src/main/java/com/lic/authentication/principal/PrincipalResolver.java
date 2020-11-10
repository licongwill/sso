package com.lic.authentication.principal;



import com.lic.authentication.AuthenticationHandler;
import com.lic.authentication.Credential;

import java.util.Optional;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:38
 */
public interface PrincipalResolver {
    /**
     * 解析principal(使用任意策略，从credential中解析principal)
     * @param credential
     * @return
     */
    default Principal resolve(Credential credential){
        return resolve(credential, Optional.empty(), Optional.empty());
    }

    default Principal resolve(final Credential credential, final Optional<AuthenticationHandler> handler) {
        return resolve(credential, Optional.empty(), handler);
    }

    Principal resolve(Credential credential, Optional<Principal> principal, Optional<AuthenticationHandler> handler);

    /**
     * 是否支持当前credential
     * @param credential
     * @return
     */
    boolean supports(Credential credential);

    default String getName() {
        return this.getClass().getSimpleName();
    }}

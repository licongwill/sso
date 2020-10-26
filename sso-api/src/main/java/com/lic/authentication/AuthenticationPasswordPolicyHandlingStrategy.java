package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/26 20:03
 */
@FunctionalInterface
public interface AuthenticationPasswordPolicyHandlingStrategy<AuthnResponse,Configuration>
    extends  AuthenticationAccountStateHandler<AuthnResponse,Configuration>{
    default boolean supports(final AuthnResponse response){return response != null;}
}

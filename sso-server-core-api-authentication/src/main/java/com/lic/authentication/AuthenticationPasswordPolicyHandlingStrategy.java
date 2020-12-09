package com.lic.authentication;

@FunctionalInterface
public interface AuthenticationPasswordPolicyHandlingStrategy<AuthnResponse,Configuration>
    extends  AuthenticationAccountStateHandler<AuthnResponse,Configuration>{
    default boolean supports(final AuthnResponse response){return response != null;}
}

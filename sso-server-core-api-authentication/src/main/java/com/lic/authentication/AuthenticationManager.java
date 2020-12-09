package com.lic.authentication;

public interface AuthenticationManager {

    String AUTHENTICATION_METHOD_ATTRIBUTE = "authenticationMethod";

    Authentication authenticate(AuthenticationTransaction transaction) throws AuthenticationException;
}

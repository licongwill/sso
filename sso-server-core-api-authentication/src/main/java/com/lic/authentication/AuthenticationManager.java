package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/26 19:58
 */
public interface AuthenticationManager {

    String AUTHENTICATION_METHOD_ATTRIBUTE = "authenticationMethod";

    Authentication authenticate(AuthenticationTransaction transaction) throws AuthenticationException;
}

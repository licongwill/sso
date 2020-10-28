package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/28 20:57
 */
public interface RememberMeCredential extends Credential {
    String AUTHENTICATION_ATTRIBUTE_REMEMBER_ME = "com.lic.sso.authentication.principal.REMEMBER_ME";

    String REQUEST_PARAMETER_REMEMBER_ME = "rememberMe";

    boolean isRememberMe();

    void setRememberMe(boolean rememberMe);
}

package com.lic.authentication;

public interface RememberMeCredential extends Credential {
    String AUTHENTICATION_ATTRIBUTE_REMEMBER_ME = "com.lic.sso.authentication.principal.REMEMBER_ME";

    String REQUEST_PARAMETER_REMEMBER_ME = "rememberMe";

    boolean isRememberMe();

    void setRememberMe(boolean rememberMe);
}

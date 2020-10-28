package com.lic.sso.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:02
 */
public interface CredentialMetaData {

    String getId();

    Class<? extends Credential> getCredentialClass();
}

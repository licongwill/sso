package com.lic.authentication;

public interface CredentialMetaData {

    String getId();

    Class<? extends Credential> getCredentialClass();
}

package com.lic.authentication;

import com.lic.authentication.principal.Service;

import java.io.Serializable;

public interface AuthenticationResult extends Serializable {
    /**
     * get authentication
     * @return
     */
    Authentication getAuthentication();

    /**
     * get service
     * @return
     */
    Service getService();

    /**
     *
     * @return
     */
    boolean isCredentialProvided();
}

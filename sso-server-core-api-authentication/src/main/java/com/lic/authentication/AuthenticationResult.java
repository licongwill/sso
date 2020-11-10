package com.lic.authentication;

import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/26 20:06
 */
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

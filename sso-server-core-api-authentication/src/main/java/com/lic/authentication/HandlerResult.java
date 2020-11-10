package com.lic.authentication;

import com.lic.sso.authentication.principal.Principal;

import java.io.Serializable;
import java.util.List;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:01
 */
public interface HandlerResult extends Serializable {
    /**
     * get handlerName
     * @return
     */
    String getHandlerName();

    /**
     * get credentialMetaData
     * @return
     */
    CredentialMetaData getCredentialMetaData();

    /**
     * get principal
     * @return
     */
    Principal getPrincipal();


    /**
     * get warnings
     * @return
     */
    List<MessageDescriptor> getWarnings();
}

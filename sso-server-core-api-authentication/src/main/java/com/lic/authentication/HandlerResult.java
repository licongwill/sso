package com.lic.authentication;

import com.lic.authentication.principal.Principal;

import java.io.Serializable;
import java.util.List;

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

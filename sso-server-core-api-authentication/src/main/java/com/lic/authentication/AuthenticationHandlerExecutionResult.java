package com.lic.authentication;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lic.authentication.principal.Principal;

import java.io.Serializable;
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface AuthenticationHandlerExecutionResult extends Serializable {


    /**
     * 获取handler名称
     * @return
     */
    String getHandlerName();

    /**
     * 获取credentialMetaData
     * @return
     */
    CredentialMetaData getCredentialMetaData();

    /**
     * 获取principal
     * @return
     */
    Principal getPrincipal();

    /**
     * gets
     * warnings
     * @return
     */
    List<MessageDescriptor> getWarnings();

}

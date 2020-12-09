package com.lic.authentication;

import java.io.Serializable;

public interface MessageDescriptor extends Serializable {

    /**
     * 获取code
     * @return
     */
    String getCode();

    /**
     * get default message
     * @return
     */
    String getDefaultMessage();

    /**
     * get params
     * @return
     */
    Serializable[] getParams();
}

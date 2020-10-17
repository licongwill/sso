package com.lic.authentication;

import java.io.Serializable;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:04
 */
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

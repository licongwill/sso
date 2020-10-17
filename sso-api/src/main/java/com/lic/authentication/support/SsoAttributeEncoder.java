package com.lic.authentication.support;

import com.lic.authentication.principal.Service;

import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:27
 */
public interface SsoAttributeEncoder {

    /**
     * encode 属性
     * @param attributes
     * @param service
     * @return
     */
    Map<String,Object> encodeAttributes(Map<String,Object> attributes, Service service);
}

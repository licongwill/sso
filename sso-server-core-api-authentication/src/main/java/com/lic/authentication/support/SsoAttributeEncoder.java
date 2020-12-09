package com.lic.authentication.support;


import com.lic.authentication.principal.Service;

import java.util.Map;


public interface SsoAttributeEncoder {

    /**
     * encode 属性
     * @param attributes
     * @param service
     * @return
     */
    Map<String,Object> encodeAttributes(Map<String, Object> attributes, Service service);
}

package com.lic.sso.services.authentication;

import com.lic.sso.services.RegisteredService;

import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/30 11:36
 */
@FunctionalInterface
public interface ProtocolAttributeEncoder {

    Map<String, Object> encodeAttributes(Map<String, Object> attributes, RegisteredService service);
}

package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.core.Ordered;

import java.io.Serializable;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:31
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceAccessStrategy extends Serializable,Ordered {

    /**
     * 验证服务是否被开启、被识别
     * @return
     */
    @JsonIgnore
    default boolean isServiceAccessAllowed(){return true;}

    /**
     * 设置服务可以访问
     * @param enabled
     */
    @JsonIgnore
    default void setServiceAccessAllowed(final boolean enabled) {
    }

    @JsonIgnore
    default boolean isServiceAccessAllowedForSso() {
        return true;
    }


    @JsonIgnore
    default boolean doPrincipalAttributesAllowServiceAccess(final String principal, final Map<String, Object> attributes) {
        return true;
    }


    default URI getUnauthorizedRedirectUrl() {
        return null;
    }

    @Override
    default int getOrder() {
        return Integer.MAX_VALUE;
    }

    default RegisteredServiceDelegatedAuthenticationPolicy getDelegatedAuthenticationPolicy() {
        return null;
    }

    default Map<String, Set<String>> getRequiredAttributes() {
        return new HashMap<>();
    }
}

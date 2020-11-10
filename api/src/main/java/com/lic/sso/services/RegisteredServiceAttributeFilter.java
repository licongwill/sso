package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.core.Ordered;

import java.io.Serializable;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:39
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@FunctionalInterface
public interface RegisteredServiceAttributeFilter extends Serializable,Ordered {

    Map<String, Object> filter(Map<String, Object> givenAttributes);

    @Override
    default int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}

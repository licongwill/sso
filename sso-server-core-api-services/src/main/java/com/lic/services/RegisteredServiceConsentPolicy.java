package com.lic.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:06
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceConsentPolicy extends Serializable {

    /**
     * 是否开启
     * @return
     */
    default boolean isEnabled(){return true;}

    /**
     * 获取排除的属性
     * @return
     */
    default Set<String> getExcludedAttributes(){return new  LinkedHashSet(0);}

    /**
     * 获取包含的属性
     * @return
     */
    default Set<String> getIncludeOnlyAttributes() {
        return new LinkedHashSet<>(0);
    }
}

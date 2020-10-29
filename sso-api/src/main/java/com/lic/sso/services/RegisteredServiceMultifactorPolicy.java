package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.Set;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:25
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceMultifactorPolicy extends Serializable {
    /**
     * 获取providers
     * @return
     */
    Set<String> getMultifactorAuthenticationProviders();

    /**
     * 获取错误模式
     * @return
     */
    FailureModes getFailureMode();

    /**
     * 获取主体属性名称
     * @return
     */
    String getPrincipalAttributeNameTrigger();

    /**
     * 获取主体属性值
     * @return
     */
    String getPrincipalAttributeValueToMatch();

    /**
     * 是否绕过启动
     * @return
     */
    boolean isBypassEnabled();


    enum FailureModes{
        OPEN,
        CLOSED,
        PHANTOM,
        NONE,
        UNDEFINED
    }
}

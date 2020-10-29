package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:13
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredService extends Serializable,Comparable<RegisteredService> {
    /**
     * 初始化id值
     */
    long INITIAL_IDENTIFIER_VALUE = -1;

    /**
     * 获取失效策略
     * @return
     */
    RegisteredServiceExpirationPolicy getExpirationPolicy();

    /**
     * 获取注册服务代理策略
     * @return
     */
    RegisteredServiceProxyPolicy getProxyPolicy();

    /**
     * 获取服务ID
     * @return
     */
    String getServiceId();

    /**
     * 获取ID
     * @return
     */
    long getId();

    /**
     * set ID
     * @param id
     */
    void setId(long id);

    /**
     * 获取名称
     * @return
     */
    String getName();

    /**
     * 获取主题
     * @return
     */
    String getTheme();

    /**
     * 获取描述
     * @return
     */
    String getDescription();

    /**
     * 获取响应类型
     * @return
     */
    String getResponseType();

    /**
     * 获取顺序
     * @return
     */
    int getEvaluationOrder();

    /**
     * 设置顺序
     * @param evaluationOrder
     */
    void setEvaluationOrder(int evaluationOrder);

    /**
     * 获取registered service username attribute
     * @return
     */
    RegisteredServiceUsernameAttributeProvider getUsernameAttributeProvider();

    /**
     * 获取认证策略
     * @return
     */
    RegisteredServiceMultifactorPolicy getMultifactorPolicy();

    /**
     * 获取需要处理器
     * @return
     */
    Set<String> getRequiredHandlers();


    Set<String> getEnvironments();

    /**
     * 获取注册服务的访问策略
     * @return
     */
    RegisteredServiceAccessStrategy getAccessStrategy();

    boolean matches(Service service);

    boolean matches(String serviceId);

    /**
     * 获取登出类型
     * @return
     */
    RegisteredServiceLogoutType getLogoutType();

    /**
     * 获取属性释放策略
     * @return
     */
    RegisteredServiceAttributeReleasePolicy getAttributeReleasePolicy();

    /**
     * 获取logo
     * @return
     */
    String getLogo();

    /**
     * 获取informationUrl
     * @return
     */
    String getInformationUrl();

    /**
     * 获取privacyUrl
     * @return
     */
    String getPrivacyUrl();

    /**
     * 获取登出url
     * @return
     */
    String getLogoutUrl();

    /**
     * 获取公钥
     * @return
     */
    RegisteredServicePublicKey getPublicKey();

    /**
     * 获取注册服务属性
     * @return
     */
    Map<String, RegisteredServiceProperty> getProperties();

    /**
     * 获取contracts
     * @return
     */
    List<RegisteredServiceContact> getContacts();

    /**
     * 获取名称
     * @return
     */
    @JsonIgnore
    default String getFriendlyName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 初始化方法
     */
    default void initialize() {
    }
}

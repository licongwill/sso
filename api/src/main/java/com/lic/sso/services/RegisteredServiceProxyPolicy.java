package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.net.URL;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:19
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceProxyPolicy extends Serializable {
    /**
     * 是否允许代理
     * @return
     */
    boolean isAllowedToProxy();

    /**
     * 是否允许代理回调
     * @param pgtUrl
     * @return
     */
    boolean isAllowedProxyCallbackUrl(URL pgtUrl);
}

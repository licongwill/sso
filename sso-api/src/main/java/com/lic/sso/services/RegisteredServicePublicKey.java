package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.security.PublicKey;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:43
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServicePublicKey extends Serializable {
    /**
     * get 公钥文件的位置
     * @return
     */
    String getLocation();

    /**
     * 获取算法
     * @return
     */
    String getAlgorithm();

    /**
     * 创建PublicKey
     * @return
     */
    PublicKey createInstance();


}

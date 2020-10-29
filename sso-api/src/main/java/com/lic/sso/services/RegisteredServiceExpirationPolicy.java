package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:16
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceExpirationPolicy extends Serializable {
    /**
     * 获取失效时间
     * @return
     */
    String getExpirationDate();

    /**
     * 当删除的时候，是否提醒
     * @return
     */
    boolean isNotifyWhenDeleted();

    /**
     * 当失效的时候是否删除
     * @return
     */
    boolean isDeletedWhenExpired();
}

package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 19:39
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceContact extends Serializable {

    /**
     * get name
     * @return
     */
    String getName();

    /**
     * get email
     * @return
     */
    String getEmail();

    /**
     * 获取手机号
     * @return
     */
    String getPhone();

    /**
     * 获取部门
     * @return
     */
    String getDepartment();
}

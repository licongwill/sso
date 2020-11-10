package com.lic.logout;

public enum LogoutRequestStatus {
    /**
     * 登出请求为执行
     */
    NOT_ATTEMPTED,

    /**
     * 登出请求失败
     */
    FAILURE,

    /**
     * 登出请求成功
     */
    SUCCESS
}

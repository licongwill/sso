package com.lic.authentication.principal;


import com.lic.authentication.Credential;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:38
 */
public interface PrincipalResolver {
    /**
     * 解析principal(使用任意策略，从credential中解析principal)
     * @param credential
     * @return
     */
    Principal resolve(Credential credential);


    /**
     * 是否支持当前credential
     * @param credential
     * @return
     */
    boolean supports(Credential credential);
}

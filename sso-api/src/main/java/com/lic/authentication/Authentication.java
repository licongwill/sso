package com.lic.authentication;

import com.lic.authentication.principal.Principal;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:29
 */
public interface Authentication extends Serializable {
    /**
     * 获取认证主体
     * @return
     */
    Principal getPrincipal();

    /**
     * 获取认证时间
     * @return
     */
    ZonedDateTime getAuthenticationDate();

    /**
     * 获取属性
     * @return
     */
    Map<String,Object> getAttributes();


    /**
     * 获取凭证
     * @return
     */
    List<CredentialMetaData> getCredentials();

    /**
     * 获取认证成功信息
     * @return
     */
    Map<String,HandlerResult> getSuccesses();


    /**
     * 获取认证失败信息
     * @return
     */
    Map<String,Class<? extends Exception>> getFailures();

    /**
     * 更新authentication
     * @param authentication
     */
    void update(Authentication authentication);
}

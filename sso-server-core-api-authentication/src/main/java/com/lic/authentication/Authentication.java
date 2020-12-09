package com.lic.authentication;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lic.authentication.principal.Principal;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
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


    void addAttribute(String name, Object value);

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

    /**
     * 更新传入的authtication对象
     * @param authentication
     */
    void updateAll(Authentication authentication);
}

package com.lic.authentication;

import com.lic.sso.authentication.principal.Principal;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 16:32
 */
public interface AuthenticationBuilder extends Serializable {
    /**
     * get principal
     * @return
     */
    Principal getPrincipal();


    /**
     * addCredentials
     * @param credentials
     * @return
     */
    AuthenticationBuilder addCredentials(List<CredentialMetaData> credentials);


    /**
     * set Principal
     * @param principal
     * @return
     */
    AuthenticationBuilder setPrincipal(Principal principal);


    /**
     * 添加crendential
     * @param credentialMetaData
     * @return
     */
    AuthenticationBuilder addCredential(CredentialMetaData credentialMetaData);

    /**
     * 添加key,value
     * @param key
     * @param value
     * @return
     */
    AuthenticationBuilder addAttribute(String key, Object value);

    /**
     * 获取认证成功信息
     * @return
     */
    Map<String,HandlerResult> getSuccesses();

    /**
     * 设置successes
     * @param successes
     * @return
     */
    AuthenticationBuilder setSuccesses(Map<String, HandlerResult> successes);

    /**
     * 添加successes
     * @param successes
     * @return
     */
    AuthenticationBuilder addSuccesses(Map<String, HandlerResult> successes);

    /**
     * 设置 failures
     * @param failures
     * @return
     */
    AuthenticationBuilder setFailures(Map<String, Class<? extends Exception>> failures);

    /**
     * 添加failures
     * @param failures
     * @return
     */
    AuthenticationBuilder addFailures(Map<String, Class<? extends Exception>> failures);

    /**
     * 添加success
     * @param key
     * @param value
     * @return
     */
    AuthenticationBuilder addSuccess(String key, HandlerResult value);

    /**
     *
     * @param date
     * @return
     */
    AuthenticationBuilder setAuthenticationDate(ZonedDateTime date);

    /**
     * 构造authentication
     * @return
     */
    Authentication build();

    /**
     * get failures
     * @return
     */
    Map<String,Class<? extends Exception>> getFailures();


    /**
     * add failure
     * @param key
     * @param value
     * @return
     */
    AuthenticationBuilder addFailure(String key, Class<? extends Exception> value);


    /**
     * set attributes
     * @param attributes
     * @return
     */
    AuthenticationBuilder setAttributes(Map<String, Object> attributes);

    /**
     * merge attribute
     * @param key
     * @param value
     * @return
     */
    AuthenticationBuilder mergeAttribute(String key, Object value);

    /**
     * has attribute
     * @param name
     * @param value
     * @return
     */
    boolean hasAttribute(String name, Predicate<Object> value);

}

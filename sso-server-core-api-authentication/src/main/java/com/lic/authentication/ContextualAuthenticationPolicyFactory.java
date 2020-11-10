package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 20:35
 */
@FunctionalInterface
public interface ContextualAuthenticationPolicyFactory<T> {
    /**
     * 创建contextual authentication policy
     * @param context
     * @return
     */
    ContextualAuthenticationPolicy<T> createPolicy(T context);
}

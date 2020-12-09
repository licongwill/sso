package com.lic.authentication;

@FunctionalInterface
public interface ContextualAuthenticationPolicyFactory<T> {
    /**
     * 创建contextual authentication policy
     * @param context
     * @return
     */
    ContextualAuthenticationPolicy<T> createPolicy(T context);
}

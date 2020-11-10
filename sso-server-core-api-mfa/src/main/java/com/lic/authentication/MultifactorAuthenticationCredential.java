package com.lic.authentication;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:49
 */
public interface MultifactorAuthenticationCredential {
    default String getProviderId() {
        return null;
    }

    default void setProviderId(final String providerId) {
    }
}

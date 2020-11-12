package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:52
 */
@FunctionalInterface
public interface MultifactorAuthenticationProviderFactoryBean<T extends MultifactorAuthenticationProvider> {
    String PROVIDER_SUFFIX = "-provider";

    T create();

    default String beanName(final String id) {
        return id.concat(PROVIDER_SUFFIX);
    }

}

package com.lic.sso.authentication;

import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public interface AuthenticationTransaction extends Serializable {

    /**
     * 获取service，链接到这个事务
     * @return
     */
    Service getService();

    /**
     * gets credentials
     * @return
     */
    Collection<Credential> getCredentials();

    /**
     * 获取第一个凭证
     * @return
     */
    default Optional<Credential> getPrimaryCredential(){return getCredentials().stream().findFirst();}


    /**
     * 当前authenticationTransaction是否包含
     * 指定的类型
     * @param type
     * @return
     */
    default boolean hasCredentialOfType(final Class<? extends Credential> type){
        return getCredentials().stream().anyMatch(type::isInstance);
    }

    /**
     * 根据type获取credentials
     * @param type
     * @param <T>
     * @return
     */
    default <T extends Credential> Collection<T> getCredentialsOfType(final Class<T> type){
        return getCredentials().stream().filter(type::isInstance).map(c->(T)c).collect(Collectors.toList());
    }
}

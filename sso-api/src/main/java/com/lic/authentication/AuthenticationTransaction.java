package com.lic.authentication;

import com.lic.authentication.principal.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

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



    default boolean hasCredentialOfType(final Class<? extends Credential> type){
        return getCredentials().stream().anyMatch(type::isInstance);
    }
}

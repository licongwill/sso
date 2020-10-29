package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:34
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@FunctionalInterface
public interface RegisteredServiceDelegatedAuthenticationPolicy extends Serializable {

    Collection<String> getAllowedProviders();

    @JsonIgnore
    default boolean isProviderAllowed(final String provider, final RegisteredService registeredService) {
        return true;
    }
}

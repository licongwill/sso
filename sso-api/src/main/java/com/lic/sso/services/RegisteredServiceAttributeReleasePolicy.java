package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lic.sso.authentication.principal.Principal;
import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:38
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceAttributeReleasePolicy extends Serializable {

    default boolean isAuthorizedToReleaseAuthenticationAttributes() {
        return true;
    }


    default boolean isAuthorizedToReleaseCredentialPassword() {
        return false;
    }


    default boolean isAuthorizedToReleaseProxyGrantingTicket() {
        return false;
    }

    default void setAttributeFilter(final RegisteredServiceAttributeFilter filter) {
    }


    Map<String, Object> getAttributes(Principal p, Service selectedService, RegisteredService service);

    default Map<String, Object> getConsentableAttributes(final Principal p, final Service selectedService,
                                                         final RegisteredService service) {
        return getAttributes(p, selectedService, service);
    }
}

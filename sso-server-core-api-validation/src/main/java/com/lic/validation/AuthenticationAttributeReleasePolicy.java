package com.lic.validation;

import com.lic.authentication.Authentication;
import com.lic.services.RegisteredService;

import java.util.HashMap;
import java.util.Map;

/**
 * This component is used to handle release of authentication attributes in validation responses.
 *
 * @author Daniel Frett
 * @since 5.2.0
 */
@FunctionalInterface
public interface AuthenticationAttributeReleasePolicy {
    /**
     * This method will return the Authentication attributes that should be released.
     *
     * @param authentication The authentication object we are processing.
     * @param assertion      the assertion
     * @param model          the model
     * @param service        the service
     * @return The attributes to be released
     */
    Map<String, Object> getAuthenticationAttributesForRelease(Authentication authentication, Assertion assertion, Map<String, Object> model, RegisteredService service);

    /**
     * NoOp authentication attribute release policy.
     *
     * @return the authentication attribute release policy
     */
    static AuthenticationAttributeReleasePolicy noOp() {
        return (authentication, assertion, model, service) -> new HashMap<>(0);
    }
}

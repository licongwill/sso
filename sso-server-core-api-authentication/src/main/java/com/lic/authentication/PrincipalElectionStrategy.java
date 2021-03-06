package com.lic.authentication;

import com.lic.authentication.principal.Principal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

@FunctionalInterface
public interface PrincipalElectionStrategy extends Serializable {
    /**
     * elect the principal
     * @param authentications
     * @param principalAttributes
     * @return
     */
    Principal nominate(Collection<Authentication> authentications, Map<String, Object> principalAttributes);
}

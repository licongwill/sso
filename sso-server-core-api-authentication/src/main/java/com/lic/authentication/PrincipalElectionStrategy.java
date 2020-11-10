package com.lic.authentication;

import com.lic.sso.authentication.principal.Principal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/26 20:11
 */
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

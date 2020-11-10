package com.lic.authentication;

import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/26 20:09
 */
public interface AuthenticationResultBuilder extends Serializable {
    /**
     * get the init authentication
     * @return
     */
    Optional<Authentication> getInitAuthentication();

    /**
     * coleect authentication
     * @param authentication
     * @return
     */
    AuthenticationResultBuilder collect(Authentication authentication);

    /**
     * collect credential
     * @param credential
     * @return
     */
    AuthenticationResultBuilder collect(Credential credential);

    /**
     * build authentcation result
     * @param principalElectionStrategy
     * @return
     */
    AuthenticationResult build(PrincipalElectionStrategy principalElectionStrategy);


    /**
     * build authentication result
     * @param principalElectionStrategy
     * @param service
     * @return
     */
    AuthenticationResult build(PrincipalElectionStrategy principalElectionStrategy, Service service);
}

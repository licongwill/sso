package com.lic.authentication;


import com.lic.authentication.principal.Service;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 11:15
 */
public interface AuthenticationSystemSupport {

    /**
     * get authentication transaction manager
     * @return
     */
    AuthenticationTransactionManager getAuthenticationTransactionManager();

    /**
     * get principal election strategy
     * @return
     */
    PrincipalElectionStrategy getPrincipalElectionStrategy();

    /**
     * 构建 authenticationContext
     * @param authentication
     * @param credential
     * @return
     */
    AuthenticationResultBuilder establishAuthenticationContextFromInitial(Authentication authentication, Credential credential);

    /**
     * 处理 authentication authentication transaction
     * @param service
     * @param credential
     * @return
     * @throws AuthenticationException
     */
    AuthenticationResultBuilder handleInitialAuthenticationTransaction(Service service, Credential... credential) throws AuthenticationException;


    /**
     * 处理authentication transaction
     * @param service
     * @param authenticationResultBuilder
     * @param credential
     * @return
     * @throws AuthenticationException
     */
    AuthenticationResultBuilder handleAuthenticationTransaction(Service service,
                                                                AuthenticationResultBuilder authenticationResultBuilder,
                                                                Credential... credential) throws AuthenticationException;

    /**
     * 完成 authentication transactions
     * @param authenticationResultBuilder
     * @param service
     * @return
     */
    AuthenticationResult finalizeAllAuthenticationTransactions(AuthenticationResultBuilder authenticationResultBuilder, Service service);

    /**
     * 处理和完成 authentication transaction
     * @param service
     * @param credential
     * @return
     * @throws AuthenticationException
     */
    AuthenticationResult handleAndFinalizeSingleAuthenticationTransaction(Service service, Credential... credential) throws AuthenticationException;

    /**
     * 处理并完成authentication transaction
     * @param service
     * @param credentials
     * @return
     * @throws AuthenticationException
     */
    default AuthenticationResult handleAndFinalizeSingleAuthenticationTransaction(final Service service,
                                                                                  final Collection<Credential> credentials) throws AuthenticationException {
        return handleAndFinalizeSingleAuthenticationTransaction(service, credentials.toArray(new Credential[credentials.size()]));
    }
}

package com.lic.authentication;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 11:12
 */
public interface AuthenticationTransactionManager {
    /**
     * authentication transaction manager
     * @param transaction
     * @param resultBuilder
     * @return
     * @throws AuthenticationException
     */
    AuthenticationTransactionManager handle(
            AuthenticationTransaction transaction,
            AuthenticationResultBuilder resultBuilder
    ) throws AuthenticationException;

    /**
     * get authentication manager
     * @return
     */
    AuthenticationManager getAuthenticationManager();
}

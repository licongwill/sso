package com.lic.authentication;

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

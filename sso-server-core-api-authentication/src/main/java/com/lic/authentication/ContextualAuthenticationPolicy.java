package com.lic.authentication;

import java.util.Optional;

public interface ContextualAuthenticationPolicy<T> {
    /**
     * get context
     * @return
     */
    T getContext();

    /**
     * get code
     * @return
     */
    default Optional<String> getCode(){return Optional.empty();}

    /**
     * @param authentication
     * @return
     * @throws Exception
     */
    boolean isSatisfiedBy(Authentication authentication) throws Exception;
}

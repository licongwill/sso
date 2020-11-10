package com.lic.authentication;

import java.util.Optional;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 11:38
 */
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

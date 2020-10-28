package com.lic.sso.authentication.principal;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:32
 */
public interface Service extends Principal {

    /**
     * set principal
     * @param principal
     */
    void  setPrincipal(Principal principal);

    /**
     * Whether the servies matches another
     * @param service
     * @return
     */
    boolean matches(Service service);
}

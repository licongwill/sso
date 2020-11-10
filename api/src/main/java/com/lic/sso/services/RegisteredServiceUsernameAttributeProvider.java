package com.lic.sso.services;

import com.lic.sso.authentication.principal.Principal;
import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:23
 */
public interface RegisteredServiceUsernameAttributeProvider extends Serializable {
    /**
     * 解析用户名称
     * @param principal
     * @param service
     * @param registeredService
     * @return
     */
    String resolveUsername(Principal principal, Service service, RegisteredService registeredService);

}

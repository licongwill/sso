package com.lic.logout.slo;

import com.lic.authentication.principal.WebApplicationService;
import com.lic.services.RegisteredService;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 10:35
 */
@FunctionalInterface
public interface SingleLogoutServiceLogoutUrlBuilder {
    /**
     * determine logout url
     * @param registeredService
     * @param webApplicationService
     * @return
     */
    Collection<SingleLogoutUrl> determineLogoutUrl(RegisteredService registeredService, WebApplicationService webApplicationService);
}

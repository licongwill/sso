package com.lic.sso.services;

import java.io.File;
import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:10
 */
public interface ResourceBasedServiceRegistry extends ServiceRegistry {
    /**
     * 更新registedService
     * @param registeredService
     */
    void update(RegisteredService registeredService);

    /**
     * 加载registedService
     * @param file
     * @return
     */
    Collection<RegisteredService> load(File file);
}

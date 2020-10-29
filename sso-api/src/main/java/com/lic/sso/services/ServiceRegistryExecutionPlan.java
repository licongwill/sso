package com.lic.sso.services;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:15
 */
public interface ServiceRegistryExecutionPlan {

    /**
     * 注册 service registry
     * @param registry
     * @return
     */
    ServiceRegistryExecutionPlan registerServiceRegistry(ServiceRegistry registry);

    /**
     * get service registries
     * @return
     */
    Collection<ServiceRegistry> getServiceRegistries();

    /**
     * 查找service registry
     * @param typeFilter
     * @return
     */
    Collection<ServiceRegistry> find(Predicate<ServiceRegistry> typeFilter);
}

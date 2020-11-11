package com.lic.services;


import com.lic.authentication.principal.Service;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:42
 */
public interface ServicesManager {

    /**
     * 保存
     * @param registeredService
     * @return
     */
    RegisteredService save(RegisteredService registeredService);

    /**
     * 保存
     * @param registeredService
     * @param publishEvent
     * @return
     */
    RegisteredService save(RegisteredService registeredService, boolean publishEvent);

    /**
     * 删除所有
     */
    void deleteAll();

    /**
     * 删除
     * @param registeredService
     * @return
     */
    RegisteredService delete(RegisteredService registeredService);

    /**
     * 查询registed service
     * @param serviceId
     * @return
     */
    RegisteredService findServiceBy(String serviceId);

    /**
     * 查询服务
     * @param predicate
     * @return
     */
    Collection<RegisteredService> findServiceBy(Predicate<RegisteredService> predicate);

    /**
     * 查询服务
     * @param serviceId
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends RegisteredService> T findServiceBy(Service serviceId, Class<T> clazz);

    /**
     * 查询服务
     * @param serviceId
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends RegisteredService> T findServiceBy(String serviceId, Class<T> clazz);

    /**
     * 查询服务
     * @param id
     * @return
     */
    RegisteredService findServiceBy(long id);

    /**
     * 查询所有服务
     * @return
     */
    Collection<RegisteredService> getAllServices();


    /**
     * 是否匹配存在服务
     * @param service
     * @return
     */
    boolean matchesExistingService(Service service);

    /**
     * 是否匹配
     * @param service
     * @return
     */
    boolean matchesExistingService(String service);

    /**
     * 加载
     * @return
     */
    Collection<RegisteredService> load();

    default int count() {
        return 0;
    }

    default Collection<RegisteredService> getServicesForDomain(final String domain) {
        return getAllServices();
    }

    default Collection<String> getDomains() {
        return Stream.of("default").collect(Collectors.toList());
    }

}

package com.lic.sso.services;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:13
 */
public interface ServiceRegistry {
    /**
     * 保存
     * @param registeredService
     * @return
     */
    RegisteredService save(RegisteredService registeredService);

    /**
     * 删除
     * @param registeredService
     * @return
     */
    boolean delete(RegisteredService registeredService);

    /**
     * 加载注册服务
     * @return
     */
    Collection<RegisteredService> load();

    /**
     * 查询服务
     * @param id
     * @return
     */
    RegisteredService findServiceById(long id);

    /**
     * 查询服务
     * @param id
     * @return
     */
    RegisteredService findServiceById(String id);

    /**
     * 查询service
     * @param id
     * @return
     */
    default RegisteredService findServiceByExactServiceId(final String id) {
        return load()
                .stream()
                .filter(r -> StringUtils.isNotBlank(r.getServiceId()) && r.getServiceId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * 查询ser
     * @param name
     * @return
     */
    default RegisteredService findServiceByExactServiceName(final String name) {
        return load()
                .stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    default long size() {
        return load().size();
    }


    String getName();
}

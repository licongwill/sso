package com.lic.authentication;

import com.lic.authentication.principal.Service;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 11:09
 */
public interface AuthenticationServiceSelectionPlan {
    /**
     * 注册服务选择策略
     * @param strategy
     */
    void registerStrategy(AuthenticationServiceSelectionStrategy strategy);

    /**
     * 解析service
     * @param service
     * @return
     */
    Service resolveService(Service service);

    /**
     * 解析service
     * @param service
     * @param clazz
     * @param <T>
     * @return
     */

    <T extends Service> T resolveService(Service service, Class<T> clazz);
}

package com.lic.authentication.principal;

import javax.servlet.http.HttpServletRequest;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 13:43
 */
public interface ServiceFactory<T extends Service> {
    /**
     * 创建service,基于HttpServletRequest
     * @param request
     * @return
     */
    T createService(HttpServletRequest request);


    /**
     * 创建service,基于id
     * @param id
     * @return
     */
    T createService(String id);


    /**
     * 创建service,基于id,clazz
     * @param id
     * @param clazz
     * @return
     */
    T createService(String id, Class<? extends Service> clazz);


    /**
     * 创建service,基于request,clazz
     * @param request
     * @param clazz
     * @return
     */
    T createService(HttpServletRequest request, Class<? extends Service> clazz);
}

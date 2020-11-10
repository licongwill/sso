package com.lic.authentication.principal;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 13:41
 */
public interface ResponseBuilder<T extends WebApplicationService> extends Serializable {

    /**
     * 构建响应
     * @param service
     * @param ticketId
     * @return
     */
    Response build(T service, String ticketId);
}

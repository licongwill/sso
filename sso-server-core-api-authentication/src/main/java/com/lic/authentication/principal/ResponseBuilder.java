package com.lic.authentication.principal;

import java.io.Serializable;


public interface ResponseBuilder<T extends WebApplicationService> extends Serializable {

    /**
     * 构建响应
     * @param service
     * @param ticketId
     * @return
     */
    Response build(T service, String ticketId);
}

package com.lic.sso.ticket;

import com.lic.sso.authentication.principal.Service;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:39
 */
public interface TransientSessionTicketFactory extends TicketFactory {

    /**
     * 创建 TransientSessionTicket
     * @param service
     * @param properties
     * @return
     */
    TransientSessionTicket create(Service service, Map<String, Serializable> properties);

    /**
     * 创建 TransientSessionTicket
     * @param service
     * @return
     */
    default TransientSessionTicket create(final Service service) {
        return create(service, new LinkedHashMap<>());
    }
}

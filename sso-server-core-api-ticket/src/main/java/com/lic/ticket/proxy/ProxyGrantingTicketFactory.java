package com.lic.ticket.proxy;

import com.lic.authentication.Authentication;
import com.lic.ticket.ServiceTicket;
import com.lic.ticket.TicketFactory;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 13:54
 */
public interface ProxyGrantingTicketFactory extends TicketFactory {
    /**
     * 创建票据
     * @param ticket
     * @param authentication
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends ProxyGrantingTicket> T create(ServiceTicket ticket, Authentication authentication, Class<T> clazz);
}

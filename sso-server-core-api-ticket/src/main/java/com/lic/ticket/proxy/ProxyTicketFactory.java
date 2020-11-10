package com.lic.ticket.proxy;


import com.lic.authentication.principal.Service;
import com.lic.ticket.Ticket;
import com.lic.ticket.TicketFactory;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 13:58
 */
public interface ProxyTicketFactory extends TicketFactory {
    /**
     * 创建票据
     * @param proxyGrantingTicket
     * @param service
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends Ticket> T create(ProxyGrantingTicket proxyGrantingTicket, Service service, Class<T> clazz);
}

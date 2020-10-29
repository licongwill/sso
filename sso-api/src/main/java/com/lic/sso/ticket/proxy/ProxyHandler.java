package com.lic.sso.ticket.proxy;

import com.lic.sso.authentication.Credential;
import com.lic.sso.ticket.TicketGrantingTicket;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 13:55
 */
@FunctionalInterface
public interface ProxyHandler {
    /**
     * 处理代理请求
     * @param credential
     * @param ticketGrantingTicket
     * @return
     */
    String handle(Credential credential, TicketGrantingTicket ticketGrantingTicket);


    default boolean canHandle(final Credential credential){return true;}
}

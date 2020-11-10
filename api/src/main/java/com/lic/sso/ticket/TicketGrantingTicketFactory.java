package com.lic.sso.ticket;

import com.lic.sso.authentication.Authentication;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:35
 */
public interface TicketGrantingTicketFactory  extends Ticket{

    <T extends TicketGrantingTicket> T create(Authentication authentication, Class<T> clazz);
}

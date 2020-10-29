package com.lic.sso.ticket;

import com.lic.sso.authentication.principal.Service;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:27
 */
public interface ServiceTicketFactory extends TicketFactory {

    <T extends Ticket> T create(TicketGrantingTicket ticketGrantingTicket,
                                Service service,boolean credentialProvided,Class<T> clazz);
}

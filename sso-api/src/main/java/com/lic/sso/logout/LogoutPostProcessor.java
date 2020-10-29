package com.lic.sso.logout;

import com.lic.sso.ticket.TicketGrantingTicket;
import org.springframework.core.Ordered;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 15:00
 */
@FunctionalInterface
public interface LogoutPostProcessor extends Ordered {

    @Override
    default int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }


    void handle(TicketGrantingTicket ticketGrantingTicket);

    default String getName(){
        return this.getClass().getSimpleName();
    }
}

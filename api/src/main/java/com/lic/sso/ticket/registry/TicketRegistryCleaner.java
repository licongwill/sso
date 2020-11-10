package com.lic.sso.ticket.registry;

import com.lic.sso.ticket.Ticket;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:13
 */
public interface TicketRegistryCleaner {

    /**
     * 清理票据
     * @return
     */
    default int clean(){return 0;}

    /**
     * 清理票据
     * @param ticket
     * @return
     */
    default int cleanTicket(final Ticket ticket){
        return 0;
    }
}

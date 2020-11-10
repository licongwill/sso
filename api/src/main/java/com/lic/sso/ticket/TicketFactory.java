package com.lic.sso.ticket;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 13:52
 */
@FunctionalInterface
public interface TicketFactory  {

    /**
     * get Ticket Factory
     * @param clazz
     * @return
     */
    TicketFactory get(Class<? extends Ticket> clazz);
}

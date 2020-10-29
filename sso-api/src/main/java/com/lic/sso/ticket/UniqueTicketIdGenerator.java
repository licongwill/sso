package com.lic.sso.ticket;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:40
 */
@FunctionalInterface
public interface UniqueTicketIdGenerator {
    int TICKET_SIZE = 24;

    String getNewTicketId(String prefix);
}

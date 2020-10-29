package com.lic.sso.ticket.registry;

import com.lic.sso.ticket.Ticket;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:00
 */
public interface TicketRegistry {

    /**
     * 添加票据
     */
    void addTicket();

    /**
     * 获取票据
     * @param ticketId
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends Ticket> T getTicket(String ticketId,Class<T> clazz);


    /**
     * 获取票据
     * @param ticketId
     * @return
     */
    Ticket getTicket(String ticketId);

    /**
     * 获取票据
     * @param predicate
     * @return
     */
    Ticket getTicket(String ticketId,Predicate<Ticket> predicate);


    /**
     * 删除票据
     * @param ticketId
     * @return
     */
    int deleteTicket(String ticketId);

    /**
     * 删除票据
     * @param ticket
     * @return
     */
    int deleteTicket(Ticket ticket);

    /**
     * 删除所有
     * @return
     */
    long deleteAll();

    /**
     * 获取票据
     * @return
     */
    Collection<? extends Ticket> getTickets();

    /**
     * 获取票据
     * @param predicate
     * @return
     */
    default Stream<? extends Ticket> getTickets(final Predicate<Ticket> predicate){
        return getTicketStream().filter(predicate);
    }

    /**
     * 更新票据
     * @param ticket
     * @return
     */
    Ticket updateTicket(Ticket ticket);

    /**
     * 计算session count
     * @return
     */
    long sessionCount();

    /**
     * 计算service ticket count
     * @return
     */
    long serviceTicketCount();

    /**
     * get stream
     * @return
     */
    default Stream<? extends Ticket> getTicketStream(){
        return getTickets().stream();
    }
}

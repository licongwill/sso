package com.lic;

import com.lic.authentication.AuthenticationException;
import com.lic.authentication.AuthenticationResult;
import com.lic.authentication.principal.Service;
import com.lic.logout.slo.SingleLogoutRequest;
import com.lic.ticket.AbstractTicketException;
import com.lic.ticket.InvalidTicketException;
import com.lic.ticket.ServiceTicket;
import com.lic.ticket.TicketGrantingTicket;
import com.lic.ticket.proxy.ProxyGrantingTicket;
import com.lic.ticket.proxy.ProxyTicket;
import com.lic.validation.Assertion;
import sun.security.krb5.internal.Ticket;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/28 21:04
 */
public interface CentralAuthenticationService {
    /**
     * sso namespace
     */
    String NAMESPACE = CentralAuthenticationService.class.getPackage().getName();


    /**
     * 创建 TGT
     * @param authenticationResult
     * @return
     */
    TicketGrantingTicket createTicketGrantingTicket(AuthenticationResult authenticationResult) throws AuthenticationException,AbstractTicketException;


    /**
     * 更新票据
     * @param ticket
     * @return
     */
    Ticket update(Ticket ticket);

    /**
     * 获取票据
     * @param ticketId
     * @return
     * @throws InvalidTicketException
     */
    Ticket getTicket(String ticketId) throws InvalidTicketException;


    /**
     * 获取票据
     * @param ticketId
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends Ticket> T getTicket(String ticketId, Class<T> clazz) throws InvalidTicketException;

    /**
     * 删除票据
     * @param ticketId
     */
    default void deleteTicket(final String ticketId){

    }

    /**
     * 获取票据
     * @param predicate
     * @return
     */
    Collection<Ticket> getTickets(Predicate<Ticket> predicate);

    /**
     * 授权服务票据
     * @param ticketGrantingTicketId
     * @param service
     * @param authenticationResult
     * @return
     */
    ServiceTicket grantServiceTicket(String ticketGrantingTicketId, Service service, AuthenticationResult authenticationResult) throws AuthenticationException,AbstractTicketException;

    /**
     * 代理票据
     * @param proxyGrantingTicket
     * @param service
     * @return
     * @throws AbstractTicketException
     */
    ProxyTicket grantProxyTicket(String proxyGrantingTicket, Service service) throws AbstractTicketException;

    /**
     * 验证服务票据
     * @param serviceTicketId
     * @param service
     * @return
     * @throws AbstractTicketException
     */
    Assertion validateServiceTicket(String serviceTicketId, Service service) throws AbstractTicketException;

    /**
     * 销毁TGT
     * @param ticketGrantingTicketId
     * @return
     */
    List<SingleLogoutRequest> destroyTicketGrantingTicket(String ticketGrantingTicketId);


    /**
     * 创建代理票据
     * @param serviceTicketId
     * @param authenticationResult
     * @return
     * @throws AuthenticationException
     * @throws AbstractTicketException
     */
    ProxyGrantingTicket createProxyGrantingTicket(String serviceTicketId, AuthenticationResult authenticationResult)
            throws AuthenticationException, AbstractTicketException;
}

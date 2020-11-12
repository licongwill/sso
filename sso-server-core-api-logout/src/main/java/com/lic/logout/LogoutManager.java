package com.lic.logout;

import com.lic.logout.slo.SingleLogoutRequest;
import com.lic.ticket.TicketGrantingTicket;

import java.util.List;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 10:47
 */
@FunctionalInterface
public interface LogoutManager {

    List<SingleLogoutRequest> performLogout(TicketGrantingTicket ticket);
}

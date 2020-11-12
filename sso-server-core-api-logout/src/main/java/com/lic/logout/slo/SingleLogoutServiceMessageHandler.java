package com.lic.logout.slo;

import com.lic.authentication.principal.WebApplicationService;
import com.lic.ticket.TicketGrantingTicket;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 10:42
 */
public interface SingleLogoutServiceMessageHandler {

    Collection<SingleLogoutRequest> handle(WebApplicationService webApplicationService, String ticketId, TicketGrantingTicket ticketGrantingTicket);

    default String getName(){
        return this.getClass().getSimpleName();
    }

    default boolean support(final WebApplicationService webApplicationService){
        return webApplicationService!=null;
    }

    boolean performBackChannelLogout(SingleLogoutRequest request);

    SingleLogoutMessage createSingleLogoutMessage(SingleLogoutRequest logoutRequest);

}

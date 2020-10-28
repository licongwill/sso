package com.lic.sso.ticket;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.principal.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public interface TicketGrantingTicket extends  Ticket {
    String PREFIX = "TGT";

    /**
     * get authentication
     * @return
     */
    Authentication getAuthentication();

    ServiceTicket grantServiceTicket(String id, Service service,ExpirationPolicy expirationPolicy,
                                     boolean credentialProvided,boolean onlyTrackMostRecentSession);


    /**
     * 获取services
     * @return
     */
    Map<String,Service> getServices();


    Map<String,Service> getProxyGrantingTickets();


    void removeAllService();

    boolean isRoot();


    TicketGrantingTicket getRoot();

    List<Authentication> getChainedAuthentications();

    Service getProxiedBy();

    default Collection<String> getDescendantTickets(){return new HashSet<>(0);}
}

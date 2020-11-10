package com.lic.sso.ticket.proxy;

import com.lic.sso.ticket.ServiceTicket;

public interface ProxyTicket extends ServiceTicket {
    String PROXY_TICKET_PREFIX = "PT";
}

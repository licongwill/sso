package com.lic.ticket;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface ExpirationPolicy extends Serializable {

    /**
     * 票据是否有效
     * @param ticketState
     * @return
     */
    boolean isExpire(TicketState ticketState);

    default Long getTimeToLive(final TicketState ticketState){return getTimeToLive();}

    Long getTimeToLive();

    Long getTimeToIdle();

    String getName();
}

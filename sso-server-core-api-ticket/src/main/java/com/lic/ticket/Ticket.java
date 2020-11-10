package com.lic.ticket;

import java.io.Serializable;
import java.time.ZonedDateTime;

public interface Ticket extends Serializable,Comparable {

    /**
     * get ticket id
     * @return
     */
    String getId();

    /**
     * 是否有效
     * @return
     */
    boolean isExpired();

    /**
     * 获取TGT
     * @return
     */
    TicketGrantingTicket getTicketGrantingTicket();

    /**
     * 获取票据创建时间
     * @return
     */
    ZonedDateTime getCreationTime();

    /**
     * 获取使用次数
     * @return
     */
    int getCountOfUses();

    /**
     * get expiration policy
     * @return
     */
    ExpirationPolicy getExpirationPolicy();

    /**
     * 获取前缀
     * @return
     */
    String getPrefix();

    /**
     * 使票据失效
     * @return
     */
    String markTicketExpired();
}

package com.lic.ticket;


import com.lic.authentication.Authentication;

import java.time.ZonedDateTime;

public interface TicketState {

    /**
     * 获取使用次数
     * @return
     */
    int getCountOfUses();

    /**
     * 获取最后一次使用时间
     * @return
     */
    ZonedDateTime getLastTimeUsed();

    /**
     * 获取上一次使用时间
     * @return
     */
    ZonedDateTime getPriviousTimeUsed();

    /**
     * 获取创建时间
     * @return
     */
    ZonedDateTime getCreationTime();

    /**
     * get authentication
     * @return
     */
    Authentication getAuthentication();

    /**
     * get TGT
     * @return
     */
    TicketGrantingTicket getTicketGrantingTicket();

    /**
     * 更新票据
     */
    void update();
}

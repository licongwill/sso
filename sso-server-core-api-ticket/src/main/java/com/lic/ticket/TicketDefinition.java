package com.lic.ticket;

import org.springframework.core.Ordered;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:29
 */
public interface TicketDefinition extends Ordered {
    /**
     * 前缀
     * @return
     */
    String getPrefix();

    /**
     * 获取实现类
     * @return
     */
    Class<? extends Ticket> getImplementationClass();

    /**
     * get properties
     * @return
     */
    TicketDefinitionProperties getProperties();

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

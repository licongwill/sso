package com.lic.support.event;

import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:51
 */
@ToString
public abstract class AbstractSsoEvent extends ApplicationEvent{

    private static final long serialVersionUID = -93313753360334028L;

    public AbstractSsoEvent(Object source) {
        super(source);
    }
}

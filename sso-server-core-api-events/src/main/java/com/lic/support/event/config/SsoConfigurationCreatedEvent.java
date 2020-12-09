package com.lic.support.event.config;

import com.lic.support.event.AbstractSsoEvent;
import lombok.Getter;
import lombok.ToString;

import java.nio.file.Path;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:34
 */
@ToString(callSuper = true)
@Getter
public class SsoConfigurationCreatedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 1939986509782718501L;

    private final transient Path file;

    public SsoConfigurationCreatedEvent(final Object source, final Path file) {
        super(source);
        this.file = file;
    }
}

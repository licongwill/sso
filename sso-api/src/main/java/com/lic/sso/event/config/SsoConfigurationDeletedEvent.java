package com.lic.sso.event.config;

import com.lic.sso.event.AbstractSsoEvent;
import lombok.Getter;
import lombok.ToString;

import java.nio.file.Path;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:36
 */
@ToString(callSuper = true)
@Getter
public class SsoConfigurationDeletedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -6006299424260795293L;

    private final transient Path file;

    public SsoConfigurationDeletedEvent(final Object source, final Path file) {
        super(source);
        this.file = file;
    }
}

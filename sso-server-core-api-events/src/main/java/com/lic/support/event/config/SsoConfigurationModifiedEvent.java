package com.lic.support.event.config;

import com.lic.sso.event.AbstractSsoEvent;
import lombok.Getter;
import lombok.ToString;

import java.nio.file.Path;
import java.util.regex.Pattern;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:37
 */
@ToString(callSuper = true)
@Getter
public class SsoConfigurationModifiedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 2509214747035332308L;

    private static final Pattern CONFIG_FILE_PATTERN = Pattern.compile("\\.(properties|yml)", Pattern.CASE_INSENSITIVE);

    private final transient Path file;

    private final boolean override;

    public SsoConfigurationModifiedEvent(final Object source, final Path file) {
        this(source, file, false);
    }

    public SsoConfigurationModifiedEvent(final Object source, final boolean override) {
        this(source, null, override);
    }

    public SsoConfigurationModifiedEvent(final Object source, final Path file, final boolean override) {
        super(source);
        this.file = file;
        this.override = override;
    }
}

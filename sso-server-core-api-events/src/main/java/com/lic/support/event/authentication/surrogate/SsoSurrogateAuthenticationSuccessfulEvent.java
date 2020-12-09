package com.lic.support.event.authentication.surrogate;

import com.lic.authentication.principal.Principal;
import com.lic.support.event.AbstractSsoEvent;
import lombok.Getter;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 16:08
 */
@Getter
public class SsoSurrogateAuthenticationSuccessfulEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 651891256066443724L;

    private final Principal principal;

    private final String surrogate;

    public SsoSurrogateAuthenticationSuccessfulEvent(final Object source, final Principal principal, final String surrogate) {
        super(source);
        this.principal = principal;
        this.surrogate = surrogate;
    }
}

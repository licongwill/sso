package com.lic.sso.event.authentication.surrogate;

import com.lic.sso.authentication.principal.Principal;
import com.lic.sso.event.AbstractSsoEvent;
import lombok.Getter;
import lombok.ToString;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 16:07
 */
@ToString(callSuper = true)
@Getter
public class SsoSurrogateAuthenticationFailureEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -4971877729225552355L;

    private final Principal principal;

    private final String surrogate;

    public SsoSurrogateAuthenticationFailureEvent(final Object source, final Principal principal, final String surrogate) {
        super(source);
        this.principal = principal;
        this.surrogate = surrogate;
    }
}

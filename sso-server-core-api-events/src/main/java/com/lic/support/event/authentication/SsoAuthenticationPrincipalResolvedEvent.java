package com.lic.support.event.authentication;

import com.lic.sso.authentication.principal.Principal;
import com.lic.sso.event.AbstractSsoEvent;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 16:17
 */
public class SsoAuthenticationPrincipalResolvedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = 4551757445654137484L;

    private final Principal principal;

    public SsoAuthenticationPrincipalResolvedEvent(final Object source, final Principal p) {
        super(source);
        this.principal = p;
    }
}

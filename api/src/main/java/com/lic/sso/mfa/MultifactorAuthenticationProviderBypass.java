package com.lic.sso.mfa;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.services.RegisteredService;
import org.springframework.core.Ordered;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:40
 */
@FunctionalInterface
public interface MultifactorAuthenticationProviderBypass extends Serializable,Ordered {
    String AUTHENTICATION_ATTRIBUTE_BYPASS_MFA = "bypassMultifactorAuthentication";

    String AUTHENTICATION_ATTRIBUTE_BYPASS_MFA_PROVIDER = "bypassedMultifactorAuthenticationProviderId";


    boolean shouldMultifactorAuthenticationProviderExecute(Authentication authentication, RegisteredService registeredService,
                                                           MultifactorAuthenticationProvider provider,
                                                           HttpServletRequest request);
    default void updateAuthenticationToForgetBypass(final Authentication authentication) {
        authentication.addAttribute(AUTHENTICATION_ATTRIBUTE_BYPASS_MFA, Boolean.FALSE);
    }

    default void updateAuthenticationToRememberBypass(final Authentication authentication,
                                                      final MultifactorAuthenticationProvider provider) {
        authentication.addAttribute(AUTHENTICATION_ATTRIBUTE_BYPASS_MFA, Boolean.TRUE);
        authentication.addAttribute(AUTHENTICATION_ATTRIBUTE_BYPASS_MFA_PROVIDER, provider.getId());
    }

    @Override
    default int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

package com.lic.authentication;

import com.lic.authentication.principal.Principal;
import com.lic.services.RegisteredService;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 11:08
 */
@FunctionalInterface
public interface MultifactorAuthenticationProviderSelector {

    MultifactorAuthenticationProvider resolve(Collection<MultifactorAuthenticationProvider> providers,
                                              RegisteredService service,
                                              Principal principal);
}

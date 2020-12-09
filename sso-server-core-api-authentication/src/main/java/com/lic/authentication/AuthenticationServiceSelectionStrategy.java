package com.lic.authentication;

import com.lic.authentication.principal.Service;
import org.springframework.core.Ordered;

import java.io.Serializable;

public interface AuthenticationServiceSelectionStrategy extends Serializable,Ordered {
    /**
     * 解析service
     * @param service
     * @return
     */
    Service resolveServiceFrom(Service service);

    /**
     *
     * @param service
     * @return
     */
    boolean support(Service service);
}

package com.lic.authentication;

import com.lic.sso.authentication.principal.Service;
import org.springframework.core.Ordered;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/27 11:06
 */
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

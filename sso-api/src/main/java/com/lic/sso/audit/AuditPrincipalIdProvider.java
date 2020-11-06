package com.lic.sso.audit;

import com.lic.sso.authentication.Authentication;
import org.springframework.core.Ordered;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:10
 */
public interface AuditPrincipalIdProvider extends Ordered {

    /**
     * get principao id from authentication
     * @param authentication
     * @param resultValue
     * @param exception
     * @return
     */
    String getPrincipalIdFrom(Authentication authentication,Object resultValue,Exception exception);

    /**
     * support
     * @param authentication
     * @param resultValue
     * @param exception
     * @return
     */
    boolean support(Authentication authentication,Object resultValue,Exception exception);
}

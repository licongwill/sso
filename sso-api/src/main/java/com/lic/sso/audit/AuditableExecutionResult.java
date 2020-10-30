package com.lic.sso.audit;

import com.lic.sso.authentication.Authentication;
import com.lic.sso.authentication.principal.Service;
import com.lic.sso.services.RegisteredService;
import com.lic.sso.ticket.ServiceTicket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/30 14:35
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditableExecutionResult {
    /**
     * registered service
     */
    private RegisteredService registeredService;

    /**
     * service
     */
    private Service service;

    /**
     * service ticket
     */
    private ServiceTicket serviceTicket;


    /**
     * authentication
     */
    private Authentication authentication;
}

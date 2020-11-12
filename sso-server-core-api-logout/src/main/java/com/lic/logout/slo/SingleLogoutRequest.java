package com.lic.logout.slo;

import com.lic.authentication.principal.WebApplicationService;
import com.lic.logout.LogoutRequestStatus;

import java.io.Serializable;
import java.net.URL;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 15:02
 */
public interface SingleLogoutRequest extends Serializable {

    /**
     * get status
     * @return
     */
    LogoutRequestStatus getStatus();

    /**
     * set status
     * @param status
     */
    void setStatus(LogoutRequestStatus status);

    /**
     * get ticket id
     * @return
     */
    String getTicketId();

    /**
     * get WebApplicationService
     * @return
     */
    WebApplicationService getService();

    /**
     * get logoutUrl
     * @return
     */
    URL getLogoutUrl();



}

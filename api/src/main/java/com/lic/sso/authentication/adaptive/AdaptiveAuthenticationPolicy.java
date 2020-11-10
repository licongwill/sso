package com.lic.sso.authentication.adaptive;

import com.lic.sso.authentication.adaptive.geo.GeoLocationRequest;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 14:55
 */
public interface AdaptiveAuthenticationPolicy {

    /**
     *
     * @param userAgent
     * @param location
     * @return
     */
    boolean apply(String userAgent, GeoLocationRequest location);
}

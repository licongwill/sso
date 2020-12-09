package com.lic.authentication.adaptive;

import com.lic.authentication.adaptive.geo.GeoLocationRequest;


public interface AdaptiveAuthenticationPolicy {

    /**
     *
     * @param userAgent
     * @param location
     * @return
     */
    boolean apply(String userAgent, GeoLocationRequest location);
}

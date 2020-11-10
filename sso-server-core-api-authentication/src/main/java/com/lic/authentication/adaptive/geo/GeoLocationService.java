package com.lic.authentication.adaptive.geo;

import java.net.InetAddress;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 14:50
 */
public interface GeoLocationService {
    /**
     * 根据address定位位置
     * @param address
     * @return
     */
    GeoLocationResponse locate(InetAddress address);


    /**
     * 根据ip地址定位位置
     * @param ipAddress
     * @return
     */
    GeoLocationResponse locate(String ipAddress);


    /**
     * 根据经纬度定位位置
     * @param latitude
     * @param longitude
     * @return
     */
    GeoLocationResponse locate(Double latitude, Double longitude);


    /**
     * 根据ip地址和request 定位位置
     * @param ip
     * @param request
     * @return
     */
    GeoLocationResponse locate(String ip, GeoLocationRequest request);

}

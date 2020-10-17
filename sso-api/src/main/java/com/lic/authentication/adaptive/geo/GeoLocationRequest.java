package com.lic.authentication.adaptive.geo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 14:07
 */
public class GeoLocationRequest {
    /**
     * 纬度
     */
    private String latitude;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 精确程度
     */
    private String accuracy;

    /**
     * 时间戳
     */
    private String timestamp;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isValid(){
        return StringUtils.isNotBlank(this.latitude) && StringUtils.isNotBlank(this.longitude)
                && StringUtils.isNotBlank(this.accuracy) && StringUtils.isNotBlank(this.timestamp);
    }


    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        return builder.append("latitude", latitude)
                .append("longitude", longitude)
                .append("accuracy", accuracy)
                .append("timestamp", timestamp)
                .toString();
    }
}

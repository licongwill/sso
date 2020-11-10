package com.lic.support.event.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lic.sso.authentication.adaptive.geo.GeoLocationRequest;
import org.apache.commons.lang3.StringUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:06
 */
@Getter
@Setter
@AllArgsConstructor
public class SsoEvent {
    @JsonProperty("id")
    private long id = -1;

    @JsonProperty("type")
    private String type;

    @JsonProperty("principalId")
    private String principalId;

    @JsonProperty("creationTime")
    private String creationTime;

    @JsonProperty("properties")
    private Map<String, String> properties = new HashMap<>();

    public SsoEvent() {
        this.id = System.currentTimeMillis();
    }



    @JsonIgnore
    public ZonedDateTime getCreationZonedDateTime() {
        String creationTime = this.creationTime;

        var result = (LocalDateTime) null;

        try {
            ZonedDateTime parse = ZonedDateTime.parse(creationTime);
            if(Objects.nonNull(parse)){
                return parse;
            }
        }catch (final Exception e){

        }

        try {
            result = LocalDateTime.parse(creationTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        } catch (final Exception e) {
            result = null;
        }

        if (result == null) {
            try {
                result = LocalDateTime.parse(creationTime, DateTimeFormatter.ISO_ZONED_DATE_TIME);
            } catch (final Exception e) {
                result = null;
            }
        }

        if (result == null) {
            try {
                result = LocalDateTime.parse(creationTime);
            } catch (final Exception e) {
                result = null;
            }
        }

        if (result == null) {
            try {
                result = LocalDateTime.parse(creationTime.toUpperCase(), DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a"));
            } catch (final Exception e) {
                result = null;
            }
        }

        if (result == null) {
            try {
                result = LocalDateTime.parse(creationTime.toUpperCase(), DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a"));
            } catch (final Exception e) {
                result = null;
            }
        }

        if (result == null) {
            try {
                result = LocalDateTime.parse(creationTime, DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
            } catch (final Exception e) {
                result = null;
            }
        }

        if (result == null) {
            try {
                val ld = LocalDate.parse(creationTime, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                result = LocalDateTime.of(ld, LocalTime.now());
            } catch (final Exception e) {
                result = null;
            }
        }

        if (result == null) {
            try {
                val ld = LocalDate.parse(creationTime);
                result = LocalDateTime.of(ld, LocalTime.now());
            } catch (final Exception e) {
                result = null;
            }
        }
        return ZonedDateTime.from(result.atZone(ZoneId.systemDefault()));
    }

    /**
     * Put id.
     *
     * @param eventId the id
     */
    public void putEventId(final String eventId) {
        put("eventId", eventId);
    }

    /**
     * Put client ip.
     *
     * @param loc the loc
     */
    public void putClientIpAddress(final String loc) {
        put("clientip", loc);
    }

    /**
     * Put server ip.
     *
     * @param loc the loc
     */
    public void putServerIpAddress(final String loc) {
        put("serverip", loc);
    }

    /**
     * Put agent.
     *
     * @param dev the dev
     */
    public void putAgent(final String dev) {
        put("agent", dev);
    }

    @JsonIgnore
    public Long getTimestamp() {
        return Long.valueOf(get("timestamp"));
    }

    @JsonIgnore
    public String getAgent() {
        return get("agent");
    }

    @JsonIgnore
    public String getEventId() {
        return get("eventId");
    }

    @JsonIgnore
    public String getClientIpAddress() {
        return get("clientip");
    }

    @JsonIgnore
    public String getServerIpAddress() {
        return get("serverip");
    }

    public void put(final String key, final String value) {
        if (StringUtils.isBlank(value)) {
            this.properties.remove(key);
        } else {
            this.properties.put(key, value);
        }
    }

    /**
     * Get property.
     *
     * @param key the key
     * @return the string
     */
    public String get(final String key) {
        return this.properties.get(key);
    }

    /**
     * Put geo latitude.
     *
     * @param s the s
     */
    private void putGeoLatitude(final String s) {
        put("geoLatitude", s);
    }

    /**
     * Put geo longitude.
     *
     * @param s the longitude
     */
    private void putGeoLongitude(final String s) {
        put("geoLongitude", s);
    }

    /**
     * Put geo accuracy.
     *
     * @param s the accuracy
     */
    private void putGeoAccuracy(final String s) {
        put("geoAccuracy", s);
    }

    /**
     * Put geo timestamp.
     *
     * @param s the timestamp
     */
    private void putGeoTimestamp(final String s) {
        put("geoTimestamp", s);
    }

    /**
     * Put geo location.
     *
     * @param location the location
     */
    public void putGeoLocation(final GeoLocationRequest location) {
        putGeoAccuracy(location.getAccuracy());
        putGeoLatitude(location.getLatitude());
        putGeoLongitude(location.getLongitude());
        putGeoTimestamp(location.getTimestamp());
    }

    /**
     * Gets geo location.
     *
     * @return the geo location
     */
    @JsonIgnore
    public GeoLocationRequest getGeoLocation() {
        val request = new GeoLocationRequest();
        request.setAccuracy(get("geoAccuracy"));
        request.setTimestamp(get("geoTimestamp"));
        request.setLongitude(get("geoLongitude"));
        request.setLatitude(get("geoLatitude"));
        return request;
    }
}

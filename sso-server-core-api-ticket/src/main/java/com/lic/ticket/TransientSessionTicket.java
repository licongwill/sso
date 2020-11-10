package com.lic.ticket;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lic.authentication.principal.Service;

import java.io.Serializable;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:37
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface TransientSessionTicket extends Ticket {
    String PREFIX = "TST";

    /**
     * Gets properties.
     *
     * @return the properties
     */
    Map<String, Serializable> getProperties();


    /**
     * Gets service.
     *
     * @return the service
     */
    Service getService();

    /**
     * Put property.
     *
     * @param name  the name
     * @param value the value
     */
    void put(String name, Serializable value);

    /**
     * Put all properties.
     *
     * @param props the props
     */
    void putAll(Map<String, Serializable> props);

    /**
     * Contains property boolean.
     *
     * @param name the name
     * @return the boolean
     */
    boolean contains(String name);

    /**
     * Gets property.
     *
     * @param <T>   the type parameter
     * @param name  the name
     * @param clazz the clazz
     * @return the property
     */
    <T extends Serializable> T get(String name, Class<T> clazz);

    /**
     * Gets property.
     *
     * @param <T>          the type parameter
     * @param name         the name
     * @param clazz        the clazz
     * @param defaultValue the default value
     * @return the property
     */
    <T extends Serializable> T get(String name, Class<T> clazz, T defaultValue);
}

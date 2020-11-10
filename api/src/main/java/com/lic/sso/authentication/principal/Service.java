package com.lic.sso.authentication.principal;

import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:32
 */
public interface Service extends Principal {
    Logger LOGGER = LoggerFactory.getLogger(Service.class);

    /**
     * set principal
     * @param principal
     */
    default void  setPrincipal(final String principal){

    }

    /**
     * Whether the servies matches another
     * @param service
     * @return
     */
    default boolean matches(final Service service){
        try {
            val thisUrl = URLDecoder.decode(getId(), StandardCharsets.UTF_8.name());
            val serviceUrl = URLDecoder.decode(service.getId(), StandardCharsets.UTF_8.name());
            return thisUrl.equalsIgnoreCase(serviceUrl);
        }catch (final Exception e){
            LOGGER.error(e.getMessage(),e);
        }
        return false;
    }
}

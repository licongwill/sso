package com.lic.validation;

import java.util.Collection;
import java.util.Map;

/**
 * This is {@link SsoProtocolAttributesRenderer} that decides how cas protocol attributes
 * should be rendered in the final validation response. Implementations are free to choice the proper format
 * in the way that multi-valued attributes or prefixes are defined.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@FunctionalInterface
public interface SsoProtocolAttributesRenderer {

    /**
     * Render attributes.
     *
     * @param attributes the attributes, expected to be finalized and encoded.
     * @return the collection
     */
    Collection<String> render(Map<String, Object> attributes);

}

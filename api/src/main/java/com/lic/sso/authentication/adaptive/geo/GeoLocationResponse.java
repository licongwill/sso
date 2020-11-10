package com.lic.sso.authentication.adaptive.geo;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Set;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 14:26
 */
public class GeoLocationResponse {
    private Set<String> addresses = Sets.newConcurrentHashSet();

    public void addAddress(final String address){
        this.addresses.add(address);
    }

    public String buildAddress(){
        final StringBuilder builder  = new StringBuilder();
        this.addresses.forEach(n->builder.append(n.concat(",")));
        return builder.toString();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("addresses", this.addresses)
                .toString();
    }
}

package com.lic.support.event.service;

import com.lic.services.RegisteredService;
import lombok.ToString;

import java.util.Collection;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/9 19:49
 */
@ToString
public class SsoRegisteredServicesLoadedEvent extends BaseSsoRegisteredServiceEvent {
    private static final long serialVersionUID = 5752098394962404269L;

    private final Collection<RegisteredService> services;

    public SsoRegisteredServicesLoadedEvent(final Object source, final Collection<RegisteredService> services) {
        super(source);
        this.services = services;
    }

    public Collection<RegisteredService> getServices() {
        return services;
    }
}

package com.lic.logout.slo;

import com.lic.services.RegisteredServiceLogoutType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/12 10:35
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class SingleLogoutUrl implements Serializable {
    private static final long serialVersionUID = -100428725003912751L;

    private final String url;

    private final RegisteredServiceLogoutType registeredServiceLogoutType;

    private Map<String,String> properties = new LinkedHashMap<>();
}

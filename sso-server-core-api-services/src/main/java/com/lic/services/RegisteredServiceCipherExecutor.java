package com.lic.services;

import java.util.Optional;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 20:02
 */
public interface RegisteredServiceCipherExecutor {

    /**
     * 加密
     * @param data
     * @param registeredService
     * @return
     */
    String encode(String data, Optional<RegisteredService> registeredService);

    /**
     * 加密
     * @param data
     * @return
     */
    default String encode(final String data){
        return encode(data,Optional.empty());
    }

    /**
     * 解密
     * @param data
     * @param registeredService
     * @return
     */
    String decode(String data, Optional<RegisteredService> registeredService);

    default boolean isEnable(){return true;}

    default boolean supports(final RegisteredService registeredService){return true;}
}

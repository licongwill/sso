package com.lic.authentication;

import java.io.Serializable;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:37
 */
@FunctionalInterface
public interface Credential extends Serializable {

    String UNKNOWN_ID = "unknown";


    String getId();
}

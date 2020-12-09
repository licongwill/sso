package com.lic.authentication;

import java.io.Serializable;

@FunctionalInterface
public interface Credential extends Serializable {

    String UNKNOWN_ID = "unknown";


    String getId();
}

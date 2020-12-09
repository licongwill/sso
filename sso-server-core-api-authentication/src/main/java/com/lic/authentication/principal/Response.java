package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;


public interface Response extends Serializable {

    enum ResponseType{
        POST,
        REDIRECT
    }

    /**
     * get response type
     * @return
     */
    Map<String,String> getResponseType();


    /**
     * get url
     * @return
     */
    String getUrl();
}

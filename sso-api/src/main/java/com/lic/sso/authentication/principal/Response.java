package com.lic.sso.authentication.principal;

import java.io.Serializable;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 13:30
 */
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

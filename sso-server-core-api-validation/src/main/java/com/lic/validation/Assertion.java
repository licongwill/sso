package com.lic.validation;


import java.util.List;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:53
 */
public interface Assertion {

    Authentication getPrimaryAuthentication();


    List<Authentication> getChainedAuthentications();

    boolean isFromNewLogin();

    Service getService();
}

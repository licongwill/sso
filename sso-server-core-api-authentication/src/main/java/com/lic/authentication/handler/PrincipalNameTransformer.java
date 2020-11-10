package com.lic.authentication.handler;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 15:26
 */
public interface PrincipalNameTransformer  {

    String transform(String formUserId);
}

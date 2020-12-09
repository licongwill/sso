package com.lic.authentication.handler;


public interface PrincipalNameTransformer  {

    String transform(String formUserId);
}

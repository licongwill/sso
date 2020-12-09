package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;


public interface Principal extends Serializable {
    /**
     * @return 认证主体的唯一ID
     */
    String getId();


    /**
     * @return 认证主体的配置属性
     */
    Map<String,Object> getAttributes();
}

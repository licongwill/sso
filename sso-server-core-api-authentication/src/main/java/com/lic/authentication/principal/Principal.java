package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:26
 */
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

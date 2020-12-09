package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;


public interface PrincipalFactory extends Serializable {
    /**
     * 创建principal
     * @param id
     * @return
     */
    Principal createPrincipal(String id);


    /**
     * 创建principal
     * @param id
     * @param attributes
     * @return
     */
    Principal createPrincipal(String id, Map<String, Object> attributes);
}

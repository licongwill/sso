package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:35
 */
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
    Principal createPrincipal(String id, Map<String,Object> attributes);
}

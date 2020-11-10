package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:29
 */
public interface PrincipalAttributesRepository extends Serializable {

    /**
     * 获取认证主体的属性值
     * @param principal
     * @return
     */
    Map<String,Object> getAttributes(Principal principal);
}

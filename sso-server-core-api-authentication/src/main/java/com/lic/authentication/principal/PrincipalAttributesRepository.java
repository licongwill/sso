package com.lic.authentication.principal;

import java.io.Serializable;
import java.util.Map;


public interface PrincipalAttributesRepository extends Serializable {

    /**
     * 获取认证主体的属性值
     * @param principal
     * @return
     */
    Map<String,Object> getAttributes(Principal principal);
}

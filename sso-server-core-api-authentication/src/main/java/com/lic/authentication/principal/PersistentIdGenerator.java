package com.lic.authentication.principal;

import java.io.Serializable;


public interface PersistentIdGenerator extends Serializable {
    /**
     * 生成实例ID,基于一些算法和principle
     * @param principal
     * @param service
     * @return
     */
    String generate(Principal principal, Service service);
}

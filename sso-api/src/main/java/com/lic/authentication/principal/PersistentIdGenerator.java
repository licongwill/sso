package com.lic.authentication.principal;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 12:30
 */
public interface PersistentIdGenerator extends Serializable {
    /**
     * 生成实例ID,基于一些算法和principle
     * @param principal
     * @param service
     * @return
     */
    String generate(Principal principal,Service service);
}

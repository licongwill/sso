package com.lic.ticket.registry.support;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:22
 */
public interface LockingStrategy {
    /**
     * 获取锁
     * @return
     */
    boolean acquire();

    /**
     * 释放
     */
    void  release();
}

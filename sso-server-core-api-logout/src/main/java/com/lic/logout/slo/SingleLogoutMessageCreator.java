package com.lic.logout.slo;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:11
 */
@FunctionalInterface
public interface SingleLogoutMessageCreator {

    SingleLogoutMessage create(SingleLogoutRequest singleLogoutRequest);
}

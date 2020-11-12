package com.lic.logout;

import com.lic.logout.slo.SingleLogoutServiceMessageHandler;

import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 10:45
 */
public interface LogoutExecutionPlan {
    default void registerLogoutPostProcessor(final LogoutPostProcessor logoutPostProcessor){

    }

    default void registerSingleLogoutServiceMessageHandler(final SingleLogoutServiceMessageHandler handler) {
    }

    default Collection<LogoutPostProcessor> getLogoutPostProcessor() {
        return new ArrayList<>(0);
    }

    default Collection<SingleLogoutServiceMessageHandler> getSingleLogoutServiceMessageHandlers() {
        return new ArrayList<>(0);
    }
}

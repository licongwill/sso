package com.lic.web.flow;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/13 15:35
 */
public interface CasWebflowExecutionPlan {

    /**
     * Register webflow configurer.
     *
     * @param cfg the cfg
     */
    void registerWebflowConfigurer(CasWebflowConfigurer cfg);

    /**
     * Gets webflow configurers.
     *
     * @return the webflow configurers
     */
    Collection<CasWebflowConfigurer> getWebflowConfigurers();
}

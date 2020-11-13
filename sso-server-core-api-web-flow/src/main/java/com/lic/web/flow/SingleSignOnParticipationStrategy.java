package com.lic.web.flow;

import org.springframework.webflow.execution.RequestContext;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/13 15:50
 */
@FunctionalInterface
public interface SingleSignOnParticipationStrategy {
    boolean isParticipating(RequestContext context);
}

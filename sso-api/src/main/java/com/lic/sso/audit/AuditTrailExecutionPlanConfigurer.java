package com.lic.sso.audit;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:31
 */
@FunctionalInterface
public interface AuditTrailExecutionPlanConfigurer {
    /**
     * 配置auditTrailExecutionPlan
     * @param plan
     */
    void configureAuditTrailExecutionPlan(AuditTrailExecutionPlan plan);
}

package com.lic.audit;

@FunctionalInterface
public interface AuditTrailExecutionPlanConfigurer {
    /**
     * 配置auditTrailExecutionPlan
     * @param plan
     */
    void configureAuditTrailExecutionPlan(AuditTrailExecutionPlan plan);
}

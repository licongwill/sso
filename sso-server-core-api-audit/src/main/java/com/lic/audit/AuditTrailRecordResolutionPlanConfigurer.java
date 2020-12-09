package com.lic.audit;

@FunctionalInterface
public interface AuditTrailRecordResolutionPlanConfigurer {

    void configureAuditTrailRecordResolutionPlan(AuditTrailRecordResolutionPlan plan);
}

package com.lic.audit;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:46
 */
@FunctionalInterface
public interface AuditTrailRecordResolutionPlanConfigurer {

    void configureAuditTrailRecordResolutionPlan(AuditTrailRecordResolutionPlan plan);
}

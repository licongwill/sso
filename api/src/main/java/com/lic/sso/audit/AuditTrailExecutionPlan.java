package com.lic.sso.audit;

import org.apereo.inspektr.audit.AuditActionContext;
import org.apereo.inspektr.audit.AuditTrailManager;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:19
 */
public interface AuditTrailExecutionPlan {
    /**
     * 注册auditTrailManager
     * @param manager
     */
    void registerAuditTrailManager(AuditTrailManager manager);

    /**
     * get auditTrailMangers
     * @return
     */
    List<AuditTrailManager> getAuditTrailManagers();

    /**
     * record
     * @param auditActionContext
     */
    void record(AuditActionContext auditActionContext);

    /**
     * get audit records since
     * @param localDate
     * @return
     */
    Set<AuditActionContext> getAuditRecordsSince(LocalDate localDate);
}

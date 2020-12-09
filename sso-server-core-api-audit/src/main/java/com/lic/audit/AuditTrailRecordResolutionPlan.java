package com.lic.audit;

import org.apereo.inspektr.audit.spi.AuditActionResolver;
import org.apereo.inspektr.audit.spi.AuditResourceResolver;

import java.util.Map;

public interface AuditTrailRecordResolutionPlan {
    /**
     * 注册auditResourceResolver
     * @param key
     * @param auditResourceResolver
     */
    void registerAuditResourceResolver(String key, AuditResourceResolver auditResourceResolver);

    /**
     * 注册 auditActionResolver
     * @param key
     * @param auditActionResolver
     */
    void registerAuditActionResolver(String key, AuditActionResolver auditActionResolver);

    /**
     * 注册 auditActionResolver
     * @param resolverMap
     */
    void registerAuditActionResolvers(Map<String, AuditActionResolver> resolverMap);


    /**
     * get
     * @return
     */
    Map<String,AuditResourceResolver> getAuditResourceResolvers();

    /**
     * get
     * @return
     */
    Map<String,AuditActionResolver> getAuditActionResolvers();

}

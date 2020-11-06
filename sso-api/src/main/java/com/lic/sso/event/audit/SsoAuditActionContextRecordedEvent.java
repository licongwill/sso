package com.lic.sso.event.audit;

import com.lic.sso.event.AbstractSsoEvent;
import org.apereo.inspektr.audit.AuditActionContext;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:54
 */
public class SsoAuditActionContextRecordedEvent extends AbstractSsoEvent {
    private static final long serialVersionUID = -204340608555494302L;

    private final AuditActionContext auditActionContext;

    public SsoAuditActionContextRecordedEvent(final Object source,final AuditActionContext auditActionContext){
        super(source);
        this.auditActionContext = auditActionContext;
    }

    public AuditActionContext getAuditActionContext(){
        return auditActionContext;
    }
}

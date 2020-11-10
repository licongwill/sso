package com.lic.sso.audit;

/**
 * @author licong
 * @version 1.0
 * @date 2020/11/6 11:47
 */
public abstract class BaseAuditableExecution implements AuditableExecution {

    @Override
    public AuditableExecutionResult execute(final AuditableContext context) {
        return AuditableExecutionResult.of(context);
    }
}

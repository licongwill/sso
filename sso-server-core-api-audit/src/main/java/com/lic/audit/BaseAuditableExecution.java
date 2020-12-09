package com.lic.audit;

public abstract class BaseAuditableExecution implements AuditableExecution {

    @Override
    public AuditableExecutionResult execute(final AuditableContext context) {
        return AuditableExecutionResult.of(context);
    }
}

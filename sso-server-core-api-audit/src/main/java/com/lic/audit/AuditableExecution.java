package com.lic.audit;

@FunctionalInterface
public interface AuditableExecution {
    /**
     * execute
     * @param context
     * @return
     */
    AuditableExecutionResult execute(AuditableContext context);
}

package com.lic.sso.audit;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/5 20:31
 */
@FunctionalInterface
public interface AuditableExecution {
    /**
     * execute
     * @param context
     * @return
     */
    AuditableExecutionResult execute(AuditableContext context);
}

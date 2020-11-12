package com.lic.validation;

/**
 * This is {@link ServiceTicketValidationAuthorizerConfigurer}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
public interface ServiceTicketValidationAuthorizerConfigurer {

    /**
     * Configure authorizer execution plan.
     *
     * @param plan the plan
     */
    default void configureAuthorizersExecutionPlan(final ServiceTicketValidationAuthorizersExecutionPlan plan) {
    }

}

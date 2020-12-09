package com.lic.authentication;


import com.lic.authentication.principal.PrincipalResolver;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AuthenticationEventExecutionPlan {

    void registerAuthenticationHandler(AuthenticationHandler authenticationHandler);

    void registerAuthenticationMetadataPopulator(AuthenticationMetaDataPopulator authenticationMetaDataPopulator);

    void registerAuthenticationPostProcessor(AuthenticationPostProcessor authenticationPostProcessor);

    void registerAuthenticationPreProcessor(AuthenticationPreProcessor authenticationPreProcessor);

    void registerAuthenticationMetadataPopulators(Collection<AuthenticationMetaDataPopulator> populators);

    void registerAuthenticationPolicy(AuthenticationPolicy authenticationPolicy);


    void registerAuthenticationHandlerResolver(AuthenticationHandlerResolver handlerResolver);

    /**
     * 注册 authentication handler
     * principal resolver
     * @param plan
     */
    void registerAuthenticationHandlerWithPrincipalResolver(Map<AuthenticationHandler, PrincipalResolver> plan);

    /**
     * 注册 authentication handler
     * principal resolver
     * @param handler
     * @param resolver
     */
    void registerAuthenticationHandlerWithPrincipalResolver(AuthenticationHandler handler, PrincipalResolver resolver);

    /**
     * 注册:
     * <li>
     *     authentications
     * </li>
     * <li>
     *     resolver
     * </li>
     *
     * @param authenticationHandlers
     * @param resolver
     */
    void registerAuthenticationHandlerWithPrincipalResolvers(Collection<AuthenticationHandler> authenticationHandlers, PrincipalResolver resolver);

    /**
     * 注册 : authenticationHandlers,principalResolvers
     * @param authenticationHandlers
     * @param principalResolvers
     */
    void registerAuthenticationHandlerWithPrincipalResolvers(List<AuthenticationHandler> authenticationHandlers, List<PrincipalResolver> principalResolvers);

    /**
     * get authenticationHandlers
     * @param authenticationTransaction
     * @return
     */
    Set<AuthenticationHandler> getAuthenticationHandlersForTransaction(AuthenticationTransaction authenticationTransaction);


    /**
     * get authentication handlers
     * @return
     */
    Set<AuthenticationHandler> getAuthenticationHandlers();


    /**
     * get authentication populators
     * @param authenticationTransaction
     * @return
     */
    Collection<AuthenticationMetaDataPopulator> getAuthenticationMetadataPopulators(AuthenticationTransaction authenticationTransaction);

    /**
     * get authentication post processors
     * @param authenticationTransaction
     * @return
     */
    Collection<AuthenticationPostProcessor> getAuthenticationPostProcessors(AuthenticationTransaction authenticationTransaction);

    /**
     * get authentication pre processors
     * @param authenticationTransaction
     * @return
     */
    Collection<AuthenticationPreProcessor> getAuthenticationPreProcessors(AuthenticationTransaction authenticationTransaction);


    /**
     * get principal resolver
     * @param handler
     * @param transaction
     * @return
     */
    PrincipalResolver getPrincipalResolverForAuthenticationTransaction(AuthenticationHandler handler, AuthenticationTransaction transaction);

    /**
     * get authentication policy
     * @param transaction
     * @return
     */
    Collection<AuthenticationPolicy> getAuthenticationPolicies(AuthenticationTransaction transaction);


    /**
     * get authentication handler resolver
     * @param transaction
     * @return
     */
    Collection<AuthenticationHandlerResolver> getAuthenticationHandlerResolvers(AuthenticationTransaction transaction);

}
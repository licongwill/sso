package com.lic.authentication;

import org.springframework.core.Ordered;

import java.security.GeneralSecurityException;

@FunctionalInterface
public interface AuthenticationHandler extends Ordered {

    /**
     * 属性名称--包含集合，成功认证证书的处理器名称
     */
    String SUCCESSFUL_AUTHENTICATION_HANDLERS = "successfulAuthenticationHandlers";

    /**
     * 认证给定的凭证，返回结果有3种可能，实现必须遵循
     * 下面的约束：
     * <ol>
     *     <li>Success--return{@Link AuthenticationHandlerExecutionResult}</li>
     *     <li>Failure -- 抛出异常{@link GeneralSecurityException}</li>
     *     <li>未确定的 -- 抛出异常{@link PreventedException}</li>
     * </ol>
     *

     * @param credential
     * @return
     * @throws GeneralSecurityException:
     * <ul>
     *      <li>密码错误: {@code javax.security.auth.login.FailedLoginException}</li>
     *      <li>密码过期: {@code javax.security.auth.login.CredentialExpiredException}</li>
     *      <li>用户账户过期: {@code javax.security.auth.login.AccountExpiredException}</li>
     *      <li>用户账户锁定: {@code javax.security.auth.login.AccountLockedException}</li>
     *      <li>用户账户未发现: {@code javax.security.auth.login.AccountNotFoundException}</li>
     *      <li>认证次数被限制: {@code org.apereo.cas.authentication.InvalidLoginTimeException}</li>
     *      <li>认证位置不被允许: {@code org.apereo.cas.authentication.InvalidLoginLocationException}</li>
     *      <li>Expired X.509 certificate: {@code java.security.cert.CertificateExpiredException}</li>
     *   </ul>
     * @throws PreventedException
     */
    AuthenticationHandlerExecutionResult authenticate(Credential credential) throws GeneralSecurityException,PreventedException;


    default boolean support(final Credential credential){return false;}

    default boolean support(final Class<? extends Credential> clazz){return false;}

    default String getName(){return this.getClass().getSimpleName();}

    @Override
    default int getOrder(){return Integer.MAX_VALUE;}
}

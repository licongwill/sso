package com.lic.authentication.principal;


import com.lic.validation.ValidationResponseType;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/17 13:33
 */
public interface WebApplicationService extends Service {
    /**
     * 构造url,重定向服务返回
     * @param ticketId
     * @return
     */
    Response getResponse(String ticketId);

    /**
     *
     * @return
     */
    String getArtifactId();


    /**
     * 返回原始url
     * @return
     */
    String getOriginalUrl();

    /**
     * 票据验证响应格式，XML OR JSON
     * @return
     */
    ValidationResponseType getFormat();
}

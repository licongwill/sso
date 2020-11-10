package com.lic.sso.logout.slo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:56
 */
@Getter
@Builder
@ToString(of = {"payload"})
public class SingleLogoutMessage<T> implements Serializable {
    private String payload;

    private transient T message;
}

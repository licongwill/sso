package com.lic.ticket;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:42
 */
@FunctionalInterface
public interface UniqueTicketIdGeneratorConfigurer {
    /**
     * 构建
     * @return
     */
    Collection<Pair<String,UniqueTicketIdGenerator>> buildUniqueTicketIdGenerators();

}

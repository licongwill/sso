package com.lic.monitor;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/12 11:13
 */
public interface CacheStatistics {

    default long size(){return 0;};

    default long getCapacity() {
        return 0;
    }


    default long getEvictions() {
        return 0;
    }


    default long getPercentFree() {
        return 0;
    }

    String getName();

    String toString(StringBuilder builder);
}

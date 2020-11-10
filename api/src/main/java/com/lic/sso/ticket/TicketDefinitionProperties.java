package com.lic.sso.ticket;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/29 14:30
 */
public interface TicketDefinitionProperties {

    boolean isCascade();


    void  setCascade(boolean cascadeTicket);


    String getStorageName();


    void setStorageName(String storageName);


    long getStorageTimeout();


    void setStorageTimeout(long timeout);


    String getStoragePassword();

    void setStoragePassword(String password);


}

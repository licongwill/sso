package com.lic.support.event;

import com.lic.sso.event.dao.SsoEvent;

import java.time.ZonedDateTime;
import java.util.Collection;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/11/9 20:26
 */
public interface CasEventRepository {
    void save(SsoEvent ssoEvent);

    Collection<? extends  SsoEvent> load();

    Collection<? extends SsoEvent> load(ZonedDateTime dateTime);

    Collection<? extends SsoEvent> getEventsOfTypeForPrincipal(String type, String principal);

    Collection<? extends SsoEvent> getEventsOfTypeForPrincipal(String type, String principal, ZonedDateTime dateTime);

    Collection<? extends SsoEvent> getEventsOfType(String type, ZonedDateTime dateTime);

    Collection<? extends SsoEvent> getEventsForPrincipal(String id);

    Collection<? extends SsoEvent> getEventsForPrincipal(String id, ZonedDateTime dateTime);
}

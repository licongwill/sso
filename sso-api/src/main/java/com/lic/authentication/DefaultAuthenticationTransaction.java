package com.lic.authentication;

import com.lic.authentication.principal.Service;
import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/27 20:37
 */
@Getter
@RequiredArgsConstructor
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class DefaultAuthenticationTransaction  implements AuthenticationTransaction{


    private static final long serialVersionUID = -7740866021395876055L;

    private final Service service;

    private final Collection<Credential> credentials;


    /**
     *
     * @param credentials
     * @return
     */
    private static Set<Credential> sanitizeCredentials(final Credential[] credentials){
        if(Objects.isNull(credentials) || credentials.length == 0){
            return new HashSet<>(0);
        }
        LinkedHashSet<Credential> collect = Arrays.stream(credentials).filter(Objects::nonNull).collect(Collectors.toCollection(LinkedHashSet::new));
        return collect;
    }

    @Override
    public Service getService() {
        return null;
    }

    @Override
    public Collection<Credential> getCredentials() {
        return null;
    };
}

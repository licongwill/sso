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

    public static DefaultAuthenticationTransaction of(final Service service,final Credential... credentials){
        val credentialSet = sanitizeCredentials(credentials);
        return new DefaultAuthenticationTransaction(service,credentialSet);
    }

    public static DefaultAuthenticationTransaction of(final Credential... credentials){
        val credentialSet = sanitizeCredentials(credentials);
        return new DefaultAuthenticationTransaction(null,credentialSet);
    }

    /**
     * 使 credentials 无害
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

    public Optional<Credential> getPrimaryCredential(){return credentials.stream().findFirst();}


    public boolean hasCredentialOfType(final Class<? extends Credential> type){
        return credentials.stream().anyMatch(type::isInstance);
    }
}

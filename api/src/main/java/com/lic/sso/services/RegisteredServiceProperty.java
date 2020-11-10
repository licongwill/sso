package com.lic.sso.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Set;

/**
 * TODO
 *
 * @author licong
 * @version 1.0
 * @date 2020/10/29 17:45
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface RegisteredServiceProperty extends Serializable {

    Set<String> getValues();

    String getValue();

    boolean contains(String value);

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    @Getter
    @RequiredArgsConstructor
    enum RegisteredServiceProperties{
        WSFED_RELYING_PARTY_ID("wsfed.relyingPartyIdentifier", StringUtils.EMPTY),
        TOKEN_AS_SERVICE_TICKET("jwtAsServiceTicket", "false"),
        TOKEN_AS_SERVICE_TICKET_SIGNING_KEY("jwtAsServiceTicketSigningKey", StringUtils.EMPTY),
        TOKEN_AS_SERVICE_TICKET_ENCRYPTION_KEY("jwtAsServiceTicketEncryptionKey", StringUtils.EMPTY),
        TOKEN_SECRET_SIGNING("jwtSigningSecret", StringUtils.EMPTY),
        TOKEN_SECRET_SIGNING_ALG("jwtSigningSecretAlg", "HS256"),
        TOKEN_SECRET_ENCRYPTION("jwtEncryptionSecret", StringUtils.EMPTY),
        TOKEN_SECRET_ENCRYPTION_ALG("jwtEncryptionSecretAlg", StringUtils.EMPTY),
        TOKEN_SECRET_ENCRYPTION_METHOD("jwtEncryptionSecretMethod", "A192CBC-HS384"),
        TOKEN_SECRETS_ARE_BASE64_ENCODED("jwtSecretsAreBase64Encoded", "false"),
        SKIP_INTERRUPT_NOTIFICATIONS("skipInterrupt", "false"),
        HTTP_HEADER_ENABLE_CACHE_CONTROL("httpHeaderEnableCacheControl", "true"),
        HTTP_HEADER_ENABLE_XCONTENT_OPTIONS("httpHeaderEnableXContentOptions", "true"),
        HTTP_HEADER_ENABLE_STRICT_TRANSPORT_SECURITY("httpHeaderEnableStrictTransportSecurity", "true"),
        HTTP_HEADER_ENABLE_XFRAME_OPTIONS("httpHeaderEnableXFrameOptions", "true"),
        HTTP_HEADER_XFRAME_OPTIONS("httpHeaderXFrameOptions", "DENY"),
        HTTP_HEADER_ENABLE_CONTENT_SECURITY_POLICY("httpHeaderEnableContentSecurityPolicy", "true"),
        HTTP_HEADER_ENABLE_XSS_PROTECTION("httpHeaderEnableXSSProtection", "true")
        ;

        private final String propertyName;
        private final String defaultValue;


        public RegisteredServiceProperty getPropertyValue(final RegisteredService service) {
            if (isAssignedTo(service)) {
                val property = service.getProperties().entrySet()
                        .stream().filter(entry -> entry.getKey().equalsIgnoreCase(getPropertyName())
                                && StringUtils.isNotBlank(entry.getValue().getValue()))
                        .distinct().findFirst();
                if (property.isPresent()) {
                    return property.get().getValue();
                }
            }
            return null;
        }

        public <T> T getPropertyValue(final RegisteredService service, final Class<T> clazz) {
            if (isAssignedTo(service)) {
                val prop = getPropertyValue(service);
                if (prop != null) {
                    return clazz.cast(prop.getValue());
                }
            }
            return null;
        }

        public boolean isAssignedTo(final RegisteredService service) {
            return isAssignedTo(service, Predicates.alwaysTrue());
        }

        public boolean isAssignedTo(final RegisteredService registeredService, final Predicate<String> valueFilter){
            return registeredService.getProperties().entrySet().stream().
                    anyMatch(entry->entry.getKey().equalsIgnoreCase(this.getPropertyName())&&
                    StringUtils.isNotBlank(entry.getValue().getValue()) && valueFilter.apply(entry.getValue().getValue()));
        }
    }
}

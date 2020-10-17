package com.lic.authentication;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 14:57
 */
public class AuthenticationException extends RuntimeException {
    private static final long serialVersionUID = -4481376826659790709L;

    private final Map<String,Class<? extends Exception>> handlerErrors;


    private final Map<String,HandlerResult> handlerSuccesses;

    public AuthenticationException(){
        this("No supported authentication handlers found for given credentials");
    }

    public AuthenticationException(final String msg){
        this(msg, Collections.emptyMap(),Collections.EMPTY_MAP);
    }

    public AuthenticationException(final Map<String,Class<? extends Exception>> handlerErros){
        this(handlerErros,Collections.emptyMap());
    }

    public AuthenticationException(
            final Map<String,Class<? extends  Exception>> handlerErros,
            final Map<String,HandlerResult> handlerSuccesses
    ){
        this(
                String.format("%s errors, %s successes",handlerErros.size(),handlerSuccesses.size()),
                handlerErros,
                handlerSuccesses
        );
    }

    public AuthenticationException(
            final String message,
            final Map<String,Class<? extends  Exception>> handlerErros,
            final Map<String,HandlerResult> handlerSuccesses
    ){
        super(message);
        this.handlerErrors = new HashMap<>(handlerErros);
        this.handlerSuccesses = new HashMap<>(handlerSuccesses);
    }

    public Map<String, Class<? extends Exception>> getHandlerErrors() {
        return handlerErrors;
    }

    public Map<String, HandlerResult> getHandlerSuccesses() {
        return handlerSuccesses;
    }
}

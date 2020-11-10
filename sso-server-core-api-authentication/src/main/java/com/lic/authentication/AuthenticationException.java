package com.lic.authentication;

import java.util.HashMap;
import java.util.Map;

/**
 * @author licong
 * @version 1.0
 * @date 2020/10/17 14:57
 */
public class AuthenticationException extends RuntimeException {
    private static final long serialVersionUID = -4481376826659790709L;

    private final Map<String,Throwable> handlerErrors;


    private final Map<String,AuthenticationHandlerExecutionResult> handlerSuccesses;

    public AuthenticationException(){
        this("No supported authentication handlers found for given credentials");
    }

    public AuthenticationException(final String msg){
        this(msg, new HashMap<>(0),new HashMap<>(0));
    }

    public AuthenticationException(final Map<String,Throwable> handlerErros){
        this(handlerErros,new HashMap<>(0));
    }

    public AuthenticationException(
            final Map<String,Throwable> handlerErros,
            final Map<String,AuthenticationHandlerExecutionResult> handlerSuccesses
    ){
        this(
                String.format("%s errors, %s successes",handlerErros.size(),handlerSuccesses.size()),
                handlerErros,
                handlerSuccesses
        );
    }

    public AuthenticationException(
            final String message,
            final Map<String,Throwable> handlerErros,
            final Map<String,AuthenticationHandlerExecutionResult> handlerSuccesses
    ){
        super(message);
        this.handlerErrors = new HashMap<>(handlerErros);
        this.handlerSuccesses = new HashMap<>(handlerSuccesses);
    }

    public Map<String, Throwable> getHandlerErrors() {
        return handlerErrors;
    }

    public Map<String, AuthenticationHandlerExecutionResult> getHandlerSuccesses() {
        return handlerSuccesses;
    }
}

package com.lic.authentication;

public class PreventedException extends Exception {
    private static final long serialVersionUID = 3087845417497088391L;

    public PreventedException(final Throwable throwable){
        super(throwable);
    }


    public PreventedException(final String msg,final Throwable throwable){
        super(msg,throwable);
    }

    public PreventedException(final String msg){
        super(msg);
    }
}

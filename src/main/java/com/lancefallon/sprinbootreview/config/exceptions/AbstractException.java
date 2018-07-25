package com.lancefallon.sprinbootreview.config.exceptions;

public abstract class AbstractException extends Exception{

    protected CustomErrorMessage customErrorMessage;

    public AbstractException(String message){
        super(message);
    }

    public abstract CustomErrorMessage getError();

}

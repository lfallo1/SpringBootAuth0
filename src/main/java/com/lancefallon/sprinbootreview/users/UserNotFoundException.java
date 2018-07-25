package com.lancefallon.sprinbootreview.users;

import com.lancefallon.sprinbootreview.config.exceptions.AbstractException;
import com.lancefallon.sprinbootreview.config.exceptions.CustomErrorMessage;

public class UserNotFoundException extends AbstractException {

    public UserNotFoundException(CustomErrorMessage customErrorMessage) {
        super(customErrorMessage.getMessage());
        this.customErrorMessage = customErrorMessage;
    }

    @Override
    public CustomErrorMessage getError() {
        return this.customErrorMessage;
    }
}

package com.lancefallon.sprinbootreview.config.exceptions;

import com.lancefallon.sprinbootreview.users.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler({UserNotFoundException.class})
    ResponseEntity<CustomErrorMessage> handleUserException(UserNotFoundException ex) throws IOException {
        return new ResponseEntity<>(ex.getError(), HttpStatus.BAD_REQUEST);
    }

}

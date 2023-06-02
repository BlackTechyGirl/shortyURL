package com.url.shorty.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalControllerHandler {
    @ExceptionHandler
    public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(ZonedDateTime.now(), ex.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

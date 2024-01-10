package com.example.mapping.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(RecordExistException.class)
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public ResponseEntity<String> handleRecordExistException(RecordExistException e ) {
        return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.ALREADY_REPORTED);
    }
}

package com.example.mapping.exception;


public class RecordExistException extends RuntimeException{
    public RecordExistException(String message) {
        super(message);
    }
}

package com.calculator.calculator.exceptions;

public class InvalidInputException extends IllegalArgumentException{
    public InvalidInputException(String message) {
        super(message);
    }
}

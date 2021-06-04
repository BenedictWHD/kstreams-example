package com.yetti.externalmessageprocessor.externaltointernalparser.fieldparser;

public class InvalidFieldException extends Exception {
    public InvalidFieldException(String message) {
        super(message);
    }

    public InvalidFieldException(Exception e) {
        super(e);
    }
}

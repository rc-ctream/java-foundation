package com.schoolar.java.grundkurs.ch9.customers;

public class CustomerInvalidException extends RuntimeException {
    public CustomerInvalidException( String message ) {
        super( message );
    }
}

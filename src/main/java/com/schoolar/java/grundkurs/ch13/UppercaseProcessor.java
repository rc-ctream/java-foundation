package com.schoolar.java.grundkurs.ch13;

public class UppercaseProcessor implements Processor {

    @Override
    public String process( String input ) {
        return input.toUpperCase();
    }
}

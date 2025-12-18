package com.schoolar.java.grundkurs.ch11.wrapper;

public class Main {


    public static void main( String[] args ) {

        String value = "30";
        var number = Integer.valueOf( value );
        System.out.println( number );
        System.out.println( number.getClass().getCanonicalName() );

        var stringNumber = Long.toString( 30 );
        System.out.println( stringNumber );
        System.out.println( stringNumber.getClass().getCanonicalName() );

        var isEqual = Integer.compare( 3, 2 );
        System.out.println( isEqual );
    }
}

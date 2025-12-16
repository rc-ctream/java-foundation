package com.schoolar.java.grundkurs.ch9.customers;

public class Main {


    public static void main( String[] args ) {
        // ---> Der nur aufgerufen werden darf, wenn eine Bedingung AUSNAHMENLOS zutrifft
        var result = Math.sqrt( 2 - 10 );

        // mann muss assert explizit über vm aktivieren mit `-ea`
        assert !Double.isNaN( result ) : "Berechnungsergebnis ist NaN!";
        System.out.println( result );

    }
}

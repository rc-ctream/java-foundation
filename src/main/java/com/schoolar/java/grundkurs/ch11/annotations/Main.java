package com.schoolar.java.grundkurs.ch11.annotations;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<String> list = new ArrayList<>();

    public static void main( String[] args ) {
        printContent( null );
    }


    public static void printContent( @Notnull String content ) {
        System.out.println( content );
    }
}

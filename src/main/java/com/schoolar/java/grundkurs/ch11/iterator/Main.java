package com.schoolar.java.grundkurs.ch11.iterator;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main( String[] args ) {

        var numbers = List.of( 1, 2, 3, 4, 5, 6, 7 );
        numbers.forEach( System.out::println );

        var directory = List.of( 1, 2, 3, 4, 5, 6, 7 ).iterator();
//        while ( directory.hasNext() ) {
//            System.out.println( directory.next() );
//        }

        String s = "Am Anfang war das Wort, am Ende die Phrase. (Stanislaw Jerzy Lec)";
        var iterator = new WordIterator( s );

        while ( iterator.hasNext() ) {
            System.out.println( iterator.next() );
        }

        System.out.println("####");
        Stream.of( s.split( " " ) )
                .forEach( System.out::println );

    }
}

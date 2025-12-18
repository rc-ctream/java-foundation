package com.schoolar.java.grundkurs.ch13;

import lombok.NonNull;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main( String[] args ) {
        String welcome = "Welcome to chapter 13";

        // upper-cases
        var uppercases = new UppercaseProcessor().process( welcome );
        System.out.println( uppercases );

        // splitte in chunks
        ChunkProcessor chunkProcessor = new ChunkProcessor();
        var chunks = chunkProcessor.process( welcome );
        System.out.println( chunks );

        //
        Processor lastWordProcessor = lastWordProcessor();
        var lastWord = lastWordProcessor.process( welcome );
        System.out.println( lastWord );

        // methoden referenzen
        var input = List.of( "abc", "def", "ghi", "jkl" );
        var ups = input
                .stream()
                .map( Main::toUppercase )
                .toList();
        System.out.println( ups );


        // konstruktor referenzen
        var converted = Stream.of( "1", "2", "3", "4" )
                .map( Integer::new )
                .toList();

        System.out.println( converted );
    }

    public static String toUppercase( String string ) {
        return new UppercaseProcessor().process( string );
    }

    private static @NonNull Processor lastWordProcessor() {
        return input -> {
            var split = input.split( " " );
            return split[split.length - 1];
        };
    }
}

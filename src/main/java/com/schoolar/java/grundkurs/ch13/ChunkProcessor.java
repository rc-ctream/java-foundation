package com.schoolar.java.grundkurs.ch13;

import java.util.List;
import java.util.stream.Stream;

public class ChunkProcessor implements Processor {
    @Override
    public List<String> process( String input ) {
        return Stream
                .of( input.split( " " ) )
                .toList();
    }
}

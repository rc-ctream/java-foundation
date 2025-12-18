package com.schoolar.java.grundkurs.ch11.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class WordIterator implements Iterator<String>, Iterable<String> {

    private StringTokenizer st;

    public WordIterator( String sentence ) {
        st = new StringTokenizer( sentence );
    }

    @Override
    public Iterator<String> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return st.hasMoreTokens();
    }

    @Override
    public String next() {
        if ( hasNext() ) {
            return st.nextToken();
        }
        throw new NoSuchElementException();
    }
}

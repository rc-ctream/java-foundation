package com.schoolar.java.grundkurs.ch11.comparator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main( String[] args ) {

        List<Person> persons = new ArrayList<>();
        persons.add( new Person( "Rasim", "44" ) );
        persons.add( new Person( "Ramazan", "39" ) );
        persons.add( new Person( "Max", "18" ) );
        persons.add( new Person( "Thomas", "68" ) );
        persons.add( new Person( "Rasim", "18" ) );
        persons.add( new Person( "Ramazan", "60" ) );

        System.out.println(persons);
        // Rasim,Rasim,Ramazan,Ramazan,Max,Thomas

        persons.sort( ( p1, p2 ) -> p1.getName().compareTo( p2.getName() ) );
        System.out.println(persons);

    }








    private static void reflections( Person rasim ) {
        // reflection
        for ( Field field : rasim.getClass().getDeclaredFields() ) {
//            System.out.println( field.getName() );
        }

        for ( Method method : rasim.getClass().getDeclaredMethods() ) {
//            System.out.println( method.getName() );
        }
    }
}

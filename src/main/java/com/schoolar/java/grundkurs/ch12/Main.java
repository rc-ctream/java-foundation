package com.schoolar.java.grundkurs.ch12;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {

    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var welcome = List.of( "Welcome", "to", "chapter 12" );
        System.out.println( firstNumbers( welcome ) );

        var numbers = List.of( 1, 2, 3, 4, 5, 6 );
        System.out.println( firstNumbers( numbers ) );

        var longNumbers = List.of( 1L, 2L, 3L, 4L );
        System.out.println( firstNumbers( longNumbers ) );


        System.out.println( isListEmpty( welcome ) );
        System.out.println( isListEmpty( numbers ) );
        System.out.println( isListEmpty( longNumbers ) );
        System.out.println( isListEmpty( List.of() ) );


        // repository
//        var repo = new PersonRepository();
        var person = new Person();

//        repo.save( person );
//        Person found = repo.findById( 123L);
//        System.out.println(found);


        // bitte nicht nachmachen!!!
        var clazzPerson = Person.class;
        var personCreatedByReflection = clazzPerson.getConstructor(  ).newInstance(  );
        System.out.println(personCreatedByReflection);

        // TODO: Aufgabe: Erstelle ein JPA Interface, über welches Person Entitäten in die DB gespeichert,
        //  gelöscht, geladen werden können.

    }

    public static <T> boolean isListEmpty( List<T> input ) {
        return input != null && input.isEmpty();
    }

    //
    public static <T> T firstNumbers( List<T> input ) {
        return input.getFirst();
    }
}

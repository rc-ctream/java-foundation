package com.schoolar.java.grundkurs.ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainLambda {
    public static void main( String[] args ) {

        var attendees = List.of(
                new Person( "Rasim", 35, Gender.M ),
                new Person( "Ramazan", 39, Gender.M ),
                new Person( "Martin", 8, Gender.M ),
                new Person( "Thomas", 19, Gender.M ),
                new Person( "Michael", 24, Gender.M ),
                new Person( "Sandra", 24, Gender.W ),
                new Person( "Susi", 16, Gender.W )
        );

        var mutuableList = new ArrayList<>(attendees);

        // all m,w

        Predicate<Person> mAndAdult = person -> person.getGender() == Gender.M && person.getAge() > 18;
        var allM = attendees.stream()
                .filter( mAndAdult )
                .toList();

        Predicate<Person> wAndAdult = person -> person.getGender() == Gender.W && person.getAge() > 18;
        var allW = attendees.stream()
                .filter( wAndAdult )
                .toList();


        mutuableList.removeIf( person -> person.getName().equals( "Susi" ) );
        System.out.println(mutuableList);


    }


}

package com.schoolar.java.grundkurs.ch11.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String age;

    @Override
    public String toString() {
        return "{" +
               "name='" + name + '\'' +
               ", age='" + age + '\'' +
               '}';
    }

    @Override
    public boolean equals( Object o ) {
        if ( o == null || getClass() != o.getClass() ) return false;
        Person person = ( Person ) o;
        return Objects.equals( name, person.name ) && Objects.equals( age, person.age );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, age );
    }
}

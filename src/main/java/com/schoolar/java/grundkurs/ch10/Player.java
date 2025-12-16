package com.schoolar.java.grundkurs.ch10;

import lombok.Data;

@Data
public class Player {
    private String name;
    private Sport sport;

    public Player( String name ) {
        this.name = name;
        this.sport = new Sport();
    }


    class Sport {
        private String sport = "TENNIS";

        public void printSport() {
            System.out.println( this.sport );
        }
    }

}

package com.schoolar.java.grundkurs.ch10;

import com.schoolar.java.grundkurs.ch8.events.EventType;
import com.schoolar.java.grundkurs.ch8.events.IncomingEvent;

public class Main {

    public static void main( String[] args ) {

        var player = new Player("Rasim");
        player.getSport().printSport();

       var run = new Runnable(){
            @Override
            public void run() {
                System.out.println("Ich bin anonym");
            }
        };


       var eventType = new IncomingEvent() {
           @Override
           public EventType getType() {
               return EventType.ORDER_NEW;
           }
       };

        System.out.println(eventType.getType());

    }


}

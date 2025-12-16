package com.schoolar.java.grundkurs.ch8.events;

public class Main {

    public static void main( String[] args ) {

        var eventHandler = new EventHandler(); // var == final EventHandler eventHandler; var != var from JS;

        var newCustomerEvent = new CustomerEvent();
        newCustomerEvent.setCustomerName( "asdb" );

        try {
            eventHandler.handleIncomingEvent( newCustomerEvent );
        } catch ( RuntimeException e ) {
            System.out.println( e.getMessage() );
        }finally {
            System.out.println("finally");
        }

        System.out.println("FOO");

//        var newOrderEvent = new NewOrderEvent();
//        newOrderEvent.setOrderId( "000001" );
//        newOrderEvent.setCustomerId( "rami-001" );
//        newOrderEvent.setCreated( LocalDate.now() );
//        eventHandler.handleIncomingEvent( newOrderEvent );
    }
}

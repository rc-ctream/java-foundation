package com.schoolar.java.grundkurs.ch8.events;

import java.time.LocalDate;

public class Main {

    public static void main( String[] args ) {

        var eventHandler = new EventHandler(); // var == final EventHandler eventHandler; var != var from JS;

        var newCustomerEvent = new CustomerEvent();
        newCustomerEvent.setCustomerName( "Rasim" );

        var newOrderEvent = new NewOrderEvent();
        newOrderEvent.setOrderId( "000001" );
        newOrderEvent.setCustomerId( "rami-001" );
        newOrderEvent.setCreated( LocalDate.now() );

        eventHandler.handleIncomingEvent( newCustomerEvent );
        eventHandler.handleIncomingEvent( newOrderEvent );
    }
}

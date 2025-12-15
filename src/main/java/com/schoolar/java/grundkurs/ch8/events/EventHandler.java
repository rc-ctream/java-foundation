package com.schoolar.java.grundkurs.ch8.events;

public class EventHandler {

    void handleIncomingEvent( IncomingEvent incomingEvent ) {

        switch ( incomingEvent.getType() ) {
            case NEW_CUSTOMER -> handleNewCustomer( incomingEvent );
            case ORDER_NEW -> handleNewOrder( incomingEvent );
        }

    }

    private void handleNewOrder( IncomingEvent incomingEvent ) {
        var orderEvent = ( NewOrderEvent ) incomingEvent;
        var labelId = orderEvent.getLabel();
        var customerId = orderEvent.getCustomerId();
        var orderId = orderEvent.getOrderId();
        var customerOrder = new CustomerOrder( customerId, orderId );
        System.out.println( "Handle incoming NEW_ORDER_EVENT " + incomingEvent );
        System.out.println( "Order ID: " + labelId );
        System.out.println(">" + customerOrder + "<");
    }

    private void handleNewCustomer( IncomingEvent incomingEvent ) {
        System.out.println( "Handle incoming NEW_CUSTOMER_EVENT " + incomingEvent );
        var customerEvent = ( CustomerEvent ) incomingEvent;
        System.out.println( "Customer name: " + customerEvent.getCustomerName() );
    }

}

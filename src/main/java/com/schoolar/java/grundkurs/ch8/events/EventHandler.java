package com.schoolar.java.grundkurs.ch8.events;

import ch.qos.logback.core.util.StringUtil;
import com.schoolar.java.grundkurs.ch9.customers.CustomerInvalidException;

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
        System.out.println( ">" + customerOrder + "<" );
    }

    private void handleNewCustomer( IncomingEvent incomingEvent ) {
        var newCustomerEvent = ( CustomerEvent ) incomingEvent;
        var newCustomerName = newCustomerEvent.getCustomerName();

        if ( StringUtil.isNullOrEmpty( newCustomerName ) ) {
            throw new CustomerInvalidException( "Customer name is invalid" );
        }

        System.out.println( "new customer: " + newCustomerName );
    }

}

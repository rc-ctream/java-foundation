package com.schoolar.java.grundkurs.ch8.customer;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Customer, MessageType> CUSTOMERS = new HashMap<>();
    private static MessageHandler handler = new MessageHandler();

    static {
        CUSTOMERS.put( createCustomer( "abc@foolbar", "1", "001" ), MessageType.EMAIL );
        CUSTOMERS.put( createCustomer( "def@foolbar", "2", "002" ), MessageType.SMS );
        CUSTOMERS.put( createCustomer( "ghi@foolbar", "3", "003" ), MessageType.WHATSAPP );
    }


    public static void main( String[] args ) {
        var message = "Hello from Main";

        CUSTOMERS.entrySet()
                .forEach( entry -> {
                    var customer = entry.getKey();
                    var messageType = entry.getValue();

                    switch ( messageType ) {
                        case EMAIL -> sendEmail(customer);
                        case SMS -> new SmsSender().sendMessage( message, customer.getSmsNumber() );
                        case WHATSAPP -> new WhatsAppSender().sendMessage( message, customer.getWhatsAppNumber() );
                    }

                } );


    }

    private static void sendEmail( Customer customer ) {
        handler.sendMessage( new EmailSender(), customer.getEmail(), customer.getEmail() );
    }


    private static Customer createCustomer( String email, String sms, String whatsAppNumber ) {
        var customer = new Customer();
        customer.setEmail( email );
        customer.setSmsNumber( sms );
        customer.setWhatsAppNumber( whatsAppNumber );
        return customer;
    }
}

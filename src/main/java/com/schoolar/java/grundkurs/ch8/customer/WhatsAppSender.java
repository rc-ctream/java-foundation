package com.schoolar.java.grundkurs.ch8.customer;

public class WhatsAppSender implements MessageSender {

    @Override
    public void sendMessage( String message, String to ) {
        System.out.println( "Send WhatsApp-Message " + message + " to " + to );
    }

    @Override
    public MessageType getType() {
        return MessageType.WHATSAPP;
    }
}

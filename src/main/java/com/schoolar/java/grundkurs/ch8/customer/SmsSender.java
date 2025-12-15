package com.schoolar.java.grundkurs.ch8.customer;

public class SmsSender implements MessageSender {

    @Override
    public void sendMessage( String message, String to ) {
        System.out.println( "Send SMS-Message " + message + " to " + to );
    }

    @Override
    public MessageType getType() {
        return MessageType.SMS;
    }
}

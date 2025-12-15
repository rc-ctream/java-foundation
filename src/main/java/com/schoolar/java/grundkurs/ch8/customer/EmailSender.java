package com.schoolar.java.grundkurs.ch8.customer;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage( String message, String to ) {
        System.out.println( "Send EMAIL-Message " + message + " to " + to );
    }

    @Override
    public MessageType getType() {
        return MessageType.EMAIL;
    }
}

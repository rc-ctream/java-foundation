package com.schoolar.java.grundkurs.ch8.customer;

public interface MessageSender {

    void sendMessage( String message, String to );
    MessageType getType();
}

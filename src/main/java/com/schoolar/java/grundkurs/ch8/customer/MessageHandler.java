package com.schoolar.java.grundkurs.ch8.customer;

public class MessageHandler {
    public void sendMessage( MessageSender sender, String message, String to ) {
        // message, to
        sender.sendMessage( message, to );
    }

}

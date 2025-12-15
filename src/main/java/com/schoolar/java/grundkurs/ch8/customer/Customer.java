package com.schoolar.java.grundkurs.ch8.customer;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String email;
    private String smsNumber;
    private String whatsAppNumber;
}

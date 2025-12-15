package com.schoolar.java.grundkurs.ch8.events;

import lombok.Data;

@Data
public class CustomerEvent implements IncomingEvent {

    private String customerName;

    @Override
    public EventType getType() {
        return EventType.NEW_CUSTOMER;
    }
}

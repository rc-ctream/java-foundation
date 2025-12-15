package com.schoolar.java.grundkurs.ch8.events;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NewOrderEvent implements IncomingEvent, CrmLabel {

    private String customerId;
    private String orderId;
    private LocalDate created;

    @Override
    public EventType getType() {
        return EventType.ORDER_NEW;
    }
}

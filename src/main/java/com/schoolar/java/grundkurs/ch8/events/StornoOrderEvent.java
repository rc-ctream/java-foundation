package com.schoolar.java.grundkurs.ch8.events;

import lombok.Data;

@Data
public class StornoOrderEvent implements IncomingEvent {

    private String orderId;
    private String customerId;
    private String reason;


    @Override
    public EventType getType() {
        return EventType.ORDER_STORNO;
    }
}

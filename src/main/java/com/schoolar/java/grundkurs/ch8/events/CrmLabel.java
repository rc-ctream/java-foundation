package com.schoolar.java.grundkurs.ch8.events;

public interface CrmLabel {

    default String getLabel() { return "LABEL_ID: xyz"; }

}

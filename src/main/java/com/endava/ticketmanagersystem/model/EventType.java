package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int EventTypeID;

    @Column(name = "EventTypeName")
    public String EventTypeName;


    //getteri+setteri

    public int getEventTypeID() {
        return EventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        EventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        EventTypeName = eventTypeName;
    }

    //constructor

    public EventType() {
    }

    public EventType(int eventTypeID, String eventTypeName) {
        EventTypeID = eventTypeID;
        EventTypeName = eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeID=" + EventTypeID +
                ", name='" + EventTypeName + '\'' +
                '}';
    }
}

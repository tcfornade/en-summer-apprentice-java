package com.endava.ticketmanagersystem.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EventID;

 @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "EventTypeID")
    private EventType eventType;

    @OneToMany(mappedBy = "Event",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TicketCategory> ticketCategoryList;

    @Column(name = "EventDescription")
    private String EventDescription;

    @Column(name = "EventName")
    private String EventName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "StartDate")
    private Date StartDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EndDate")
    private Date EndDate;

    //getteri+setteri


    public List<TicketCategory> getTicketCategoryList() {
        return ticketCategoryList;
    }

    public void setTicketCategoryList(List<TicketCategory> ticketCategoryList) {
        this.ticketCategoryList = ticketCategoryList;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    //constructor


    public Event() {
    }

    public Event(int eventID, Venue venue, EventType eventType, List<TicketCategory> ticketCategoryList, String eventDescription, String eventName, Date startDate, Date endDate) {
        EventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        this.ticketCategoryList = ticketCategoryList;
        EventDescription = eventDescription;
        EventName = eventName;
        StartDate = startDate;
        EndDate = endDate;
    }
}

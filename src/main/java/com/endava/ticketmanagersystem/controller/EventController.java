package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.model.Event;
import com.endava.ticketmanagersystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EventController {
    @Autowired
   private EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

//    @GetMapping("/event/{resourceId}")
//    public Optional<Event> getEvents(@PathVariable Long resourceId){
//       // return eventRepository.findEvent(resourceId);
//    }
}

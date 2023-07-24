package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.model.Event;
import com.endava.ticketmanagersystem.repository.EventRepository;
import com.endava.ticketmanagersystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/event")
public class EventController {

   private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
        System.out.println("Creating Event Controller");
    }

    @GetMapping("allEvents")
    public List<Event> findAll() {
        return eventService.findAll();
    }
}

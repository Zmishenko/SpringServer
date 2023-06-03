package com.server.springserver.controller;

import com.server.springserver.model.event.Event;
import com.server.springserver.model.event.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event/get-all")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/event/save")
    public Event save(@RequestBody Event event) {
        return eventService.save(event);
    }

    @PostMapping("/event/change")
    public Event changeEvent(@RequestBody Event event) {
        return eventService.changeEvent(event);
    }
}

package com.server.springserver.model.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
// Сервис реализует бизнес логику
@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public Event save(Event event) {
        return repository.save(event);
    }

    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(events::add);
        return events;
    }

    public void delete(int eventId) {
        repository.deleteById(eventId);
    }

}

package com.example.c3.Service;

import com.example.c3.ApiResponse.ApiException;
import com.example.c3.DTO.EventDTO;
import com.example.c3.Model.Arena;
import com.example.c3.Model.Event;
import com.example.c3.Repository.ArenaRepository;
import com.example.c3.Repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService { //Renad
    // 1. Declare a dependency for EventRepository & ArenaRepository using Dependency Injection
    private final EventRepository eventRepository;

    //private final ArenaRepository arenaRepository;

    // 2. CRUD
    // 2.1 GET
    public List<EventDTO> getAllEvents() {
        List<Event> events = eventRepository.findAll();
        List<EventDTO> eventDTOS = new ArrayList<>();
        for (Event event : events) {
            EventDTO eventDTO = new EventDTO(event.getName(), event.getCity(), event.getLocation(), event.getStartDate(), event.getEndDate());
            eventDTOS.add(eventDTO);
        }
        return eventDTOS;
    }

    // 2.2 POST
//    public void addEvent(Event event) {
//        eventRepository.save(event);
//    }

    // 2.3 UPDATE
    public void updateEvent(Integer id, Event event) {
        Event oldEvent = eventRepository.findEventById(id);
        if (oldEvent == null) {
            throw new ApiException("Event Not Found.");
        }
        oldEvent.setName(event.getName());
        oldEvent.setCity(event.getCity());
        oldEvent.setLocation(event.getLocation());
        oldEvent.setStartDate(event.getStartDate());
        oldEvent.setEndDate(event.getEndDate());
        eventRepository.save(oldEvent);
    }

    // Assign an event to an arena
//    public void assignEventToArena(Integer eventId, Integer arenaId) {
//        Event event = eventRepository.findEventById(eventId);
//        Arena arena = arenaRepository.findArenaById(arenaId);
//
//        if (event == null && arena == null) {
//            throw new ApiException("Cant Assign. Event and Arena Not Found.");
//        }
//        if (event == null) {
//            throw new ApiException("Cant Assign. Event Not Found.");
//        }
//        if (arena == null) {
//            throw new ApiException("Cant Assign. Arena Not Found");
//        }
//
//        event.setArena(arena);
//        eventRepository.save(event);
//    }
}
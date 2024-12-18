package com.example.c3.Controller;

import com.example.c3.ApiResponse.ApiResponse;
import com.example.c3.Model.Event;
import com.example.c3.Service.EventService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/event")
@RequiredArgsConstructor
public class EventController {
    // 1. Declare a dependency for EventService using Dependency Injection
    private final EventService eventService;

    // 2. CRUD
    // 2.1 GET
    @GetMapping("/get")
    public ResponseEntity getAllEvents() {
        return ResponseEntity.status(200).body(eventService.getAllEvents());
    }

    // 2.2 POST
//    @PostMapping("/add")
//    public ResponseEntity addEvent(@RequestBody @Valid Event event) {
//        eventService.addEvent(event);
//        return ResponseEntity.status(200).body(new ApiResponse("New Event Added."));
//    }

    // 2.3 UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity updateEvent(@PathVariable Integer id, @RequestBody @Valid Event event) {
        eventService.updateEvent(id, event);
        return ResponseEntity.status(200).body(new ApiResponse("Event Updated."));
    }

    // Assign an event to an arena
//    @PutMapping("/AssignEventToArena/{eventId}/{arenaId}")
//    public ResponseEntity assignEventToArena(@PathVariable Integer eventId, @PathVariable Integer arenaId) {
//        eventService.assignEventToArena(eventId, arenaId);
//        return ResponseEntity.status(200).body(new ApiResponse("Assign Completed."));
//    }
}
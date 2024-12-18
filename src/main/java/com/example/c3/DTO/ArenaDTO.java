package com.example.c3.DTO;

import com.example.c3.Model.Event;
import com.example.c3.Model.Offering;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class ArenaDTO {
    private String username;

    private String name;

    private String city;

    private String location;

    private Set<Offering> offerings;

    private Set<Event> events;
}
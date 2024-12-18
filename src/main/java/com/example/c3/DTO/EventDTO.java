package com.example.c3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EventDTO {
    private String name;

    private String city;

    private String location;

    private LocalDate startDate;

    private LocalDate endDate;
}
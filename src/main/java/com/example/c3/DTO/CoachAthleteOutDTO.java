package com.example.c3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CoachAthleteOutDTO {
    // this dto is is for the get coach athletes endpoint
    // to return less data for athlete
    private String fullName;

    private String username;

    private String sportName;
}

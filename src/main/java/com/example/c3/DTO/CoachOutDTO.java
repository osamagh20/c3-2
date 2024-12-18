package com.example.c3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoachOutDTO {

    private String fullName;

    private String username;

    private String city;

    private String phoneNumber;

    private String email;

    private String sportDiscipline;

    //  private Set<Athlete> athlete;

}

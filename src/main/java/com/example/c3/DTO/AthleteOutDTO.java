package com.example.c3.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class AthleteOutDTO {

    private String fullName;

    private String username;

    private Integer age;

    private String gender;

    private String city;

    private String sportName;

    private List<AchievementOutDTO> achievements;
}

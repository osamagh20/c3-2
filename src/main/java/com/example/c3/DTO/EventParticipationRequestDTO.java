// Osama Alghamdi

package com.example.c3.DTO;
import com.example.c3.Model.Athlete;
import com.example.c3.Model.Sponsor;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventParticipationRequestDTO {

    private String status;

    private Sponsor sponsor;

    private Athlete athlete;
}

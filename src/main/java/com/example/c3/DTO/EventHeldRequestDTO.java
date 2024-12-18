// Osama Alghamdi

package com.example.c3.DTO;
import com.example.c3.Model.Arena;
import com.example.c3.Model.Event;
import com.example.c3.Model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventHeldRequestDTO {
    private String status;

    private Arena arena;

    private Sponsor sponsor;

    private Event event;
}

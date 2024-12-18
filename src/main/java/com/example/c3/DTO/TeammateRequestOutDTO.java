package com.example.c3.DTO;

import com.example.c3.Model.Athlete;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class TeammateRequestOutDTO {

    private String senderName;
    private String senderUsername;

    private String receiverName;
    private String receiverUsername;

    private String status; // requested - accepted - rejected

    private LocalDateTime requestDate;

    private LocalDateTime responseDate;
}

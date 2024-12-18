package com.example.c3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
public class BookOfferingDTO {
    private Date startDate;

    private Date endDate;

    private String status;

    private  String offeringName;

    private String athleteName;

    private String arenaName;

    private LocalDateTime bookingTimestamp;
}
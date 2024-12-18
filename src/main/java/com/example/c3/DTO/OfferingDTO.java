package com.example.c3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OfferingDTO {
    private String name;

    private String description;

    private Double price;
}
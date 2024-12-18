package com.example.c3.Controller;

import com.example.c3.ApiResponse.ApiResponse;
import com.example.c3.Service.BookOfferingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/bookOffering")
@RequiredArgsConstructor
public class BookOfferingController { //Renad

    private final BookOfferingService bookOfferingService;

    @GetMapping("/get")
    public  ResponseEntity getAllBookOffering(){
        return ResponseEntity.status(200).body(bookOfferingService.getAllBookOffering());
    }
}
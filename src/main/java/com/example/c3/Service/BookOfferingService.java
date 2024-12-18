package com.example.c3.Service;

import com.example.c3.ApiResponse.ApiException;
import com.example.c3.DTO.ArenaDTO;
import com.example.c3.DTO.BookOfferingDTO;
import com.example.c3.Model.Arena;
import com.example.c3.Model.Athlete;
import com.example.c3.Model.BookOffering;
import com.example.c3.Model.Offering;
import com.example.c3.Repository.AthleteRepository;
import com.example.c3.Repository.BookOfferingRepository;
import com.example.c3.Repository.OfferingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bookOffering")
@RequiredArgsConstructor
public class BookOfferingService { //Renad
    private final BookOfferingRepository bookOfferingRepository;
    private final OfferingRepository offeringRepository;
    private final AthleteRepository athleteRepository;

    // CRUD
    // GET
    public List<BookOfferingDTO> getAllBookOffering(){
        List<BookOffering> bookOfferings = bookOfferingRepository.findAll();
        List<BookOfferingDTO> bookOfferingDTOS = new ArrayList<>();
        for (BookOffering bookOffering: bookOfferings) {
            BookOfferingDTO bookOfferingDTO = new BookOfferingDTO(bookOffering.getStartDate(),bookOffering.getEndDate(),bookOffering.getStatus(),bookOffering.getOffering().getName(),bookOffering.getAthlete().getFullName(),bookOffering.getOffering().getArena().getName(),bookOffering.getBookingTimestamp());
            bookOfferingDTOS.add(bookOfferingDTO);
        }
        return bookOfferingDTOS;
    }
}
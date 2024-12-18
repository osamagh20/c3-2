// Osama Alghamdi

package com.example.c3.Controller;
import com.example.c3.ApiResponse.ApiResponse;
import com.example.c3.Model.EventHeldRequest;
import com.example.c3.Model.Sponsor;
import com.example.c3.DTO.SponsorDTO;
import com.example.c3.Model.SponsorShip;
import com.example.c3.Service.SponsorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sponsor")
public class SponsorController {
    private final SponsorService sponsorService;

    @GetMapping("/get")
    public ResponseEntity getAllSponsors() {
        List<SponsorDTO> sponsorList = sponsorService.getAllSponsor();
        return ResponseEntity.status(200).body(sponsorList);
    }


    @PostMapping("/add")
    public ResponseEntity addSponsor(@RequestBody @Valid Sponsor sponsor) {
        sponsorService.addSponsor(sponsor);
        return ResponseEntity.status(200).body(new ApiResponse("Sponsor added successfully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateSponsor(@PathVariable Integer id, @RequestBody @Valid Sponsor sponsor) {
        sponsorService.updateSponsor(id, sponsor);
        return ResponseEntity.status(200).body(new ApiResponse("Sponsor updated successfully"));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteSponsor(@PathVariable Integer id) {
        sponsorService.deleteSponsor(id);
        return ResponseEntity.status(200).body(new ApiResponse("Sponsor deleted successfully"));
    }

    @PostMapping("/add-sponsorship/{sponsor_id}/{athlete_id}")
    public ResponseEntity sponsorAthlete(@PathVariable Integer sponsor_id,@PathVariable Integer athlete_id,@RequestBody @Valid SponsorShip sponsorShip) {
        sponsorService.sponsorAthlete(sponsor_id,athlete_id,sponsorShip);
        return ResponseEntity.status(200).body(new ApiResponse("Sponsor add sponsorship successfully"));
    }

    @PostMapping("/add-request-event")
    public ResponseEntity requestEvent(@RequestBody @Valid EventHeldRequest eventRequest) {
        sponsorService.requestEvent(eventRequest);
        return ResponseEntity.status(200).body(new ApiResponse("Sponsor request event successfully"));
    }

    @PutMapping("/accept-event-participate/{sponsor_id}/{eventParticipate_id}")
    public ResponseEntity acceptEventParticipation(@PathVariable Integer sponsor_id,@PathVariable Integer eventParticipate_id) {
        sponsorService.acceptEventParticipation(sponsor_id, eventParticipate_id);
        return ResponseEntity.status(200).body(new ApiResponse("Sponsor accept event participation successfully"));
    }
}
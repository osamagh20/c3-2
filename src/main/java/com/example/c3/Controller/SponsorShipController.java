// Osama Alghamdi

package com.example.c3.Controller;
import com.example.c3.DTO.SponsorShipDTO;
import com.example.c3.Service.SponsorShipService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.renderable.RenderableImage;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sponsorship")
public class SponsorShipController {
    private final SponsorShipService sponsorShipService;

    @GetMapping("/get")
    public ResponseEntity getSponsorShip() {
        List<SponsorShipDTO> sponsorShipList = sponsorShipService.getAllSponsorShips();
        return ResponseEntity.status(200).body(sponsorShipList);
    }
}

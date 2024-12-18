package com.example.c3.Controller;

import com.example.c3.ApiResponse.ApiResponse;
import com.example.c3.Model.Offering;
import com.example.c3.Service.OfferingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/offering")
@RequiredArgsConstructor
public class OfferingController {
    // 1. Declare a dependency for OfferingService using Dependency Injection
    private final OfferingService offeringService;

    // 2. CRUD
    // 2.1 GET
    @GetMapping("/get")
    public ResponseEntity getAllOfferings() {
        return ResponseEntity.status(200).body(offeringService.getAllOfferings());
    }

    // 2.2 POST
    @PostMapping("/add")
    public ResponseEntity addOffering(@RequestBody @Valid Offering offering) {
        offeringService.addOffering(offering);
        return ResponseEntity.status(200).body(new ApiResponse("New Offering Added."));
    }

    // 2.3 UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity updateOffering(@PathVariable Integer id, @RequestBody @Valid Offering offering) {
        offeringService.updateOffering(id, offering);
        return ResponseEntity.status(200).body(new ApiResponse("Offering Updated."));
    }

    // 2.4 DELETE
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity deleteOffering(@PathVariable Integer id) {
//        offeringService.deleteOffering(id);
//        return ResponseEntity.status(200).body(new ApiResponse("Offering Deleted."));
//    }

    // Assign an offering to an arena
    @PutMapping("/AssignOfferingToArena/{offeringId}/{arenaId}")
    public ResponseEntity assignOfferingToArena(@PathVariable Integer offeringId, @PathVariable Integer arenaId) {
        offeringService.assignOfferingToArena(offeringId, arenaId);
        return ResponseEntity.status(200).body(new ApiResponse("Assign Completed."));
    }
}
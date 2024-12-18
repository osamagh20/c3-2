// Osama Alghamdi

package com.example.c3.Controller;
import com.example.c3.DTO.EventParticipationRequestDTO;
import com.example.c3.Service.EventParticipationRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/event-participation-request")
public class EventParticipationRequestController {
    private final EventParticipationRequestService eventParticipationRequestService;

//
//    @GetMapping("/get")
//    public ResponseEntity getAllEventParticipationRequests() {
//        List<EventParticipationRequestDTO> eventParticipationRequests = eventParticipationRequestService.getAllEventParticipationRequests();
//        return ResponseEntity.status(200).body(eventParticipationRequests);
//    }

}

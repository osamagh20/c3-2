// Osama Alghamdi

package com.example.c3.Service;
import com.example.c3.DTO.EventParticipationRequestDTO;
import com.example.c3.Model.EventParticipationRequest;
import com.example.c3.Repository.EventParticipationRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventParticipationRequestService {
    private final EventParticipationRequestRepository eventParticipationRequestRepository;

    public List<EventParticipationRequestDTO> getAllEventParticipationRequests() {
        List<EventParticipationRequest> eventParticipationRequests = eventParticipationRequestRepository.findAll();
        List<EventParticipationRequestDTO> eventParticipationRequestDTOS = new ArrayList<>();
        for (EventParticipationRequest eventParticipationRequest : eventParticipationRequests) {
            eventParticipationRequestDTOS.add(new EventParticipationRequestDTO(eventParticipationRequest.getStatus(),
                    eventParticipationRequest.getSponsor(),eventParticipationRequest.getAthlete()));
            eventParticipationRequestRepository.save(eventParticipationRequest);
        }
        return eventParticipationRequestDTOS;
    }
}

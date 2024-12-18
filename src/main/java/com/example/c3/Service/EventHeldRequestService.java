// Osama Alghamdi

package com.example.c3.Service;
import com.example.c3.DTO.EventHeldRequestDTO;
import com.example.c3.Model.EventHeldRequest;
import com.example.c3.Repository.EventHeldRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventHeldRequestService {
    private final EventHeldRequestRepository eventHeldRequestRepository;

    public List<EventHeldRequestDTO> getAllEventHeldRequests() {
        List<EventHeldRequest> eventHeldRequests = eventHeldRequestRepository.findAll();
        List<EventHeldRequestDTO> eventHeldRequestDTOS = new ArrayList<>();
        for (EventHeldRequest eventHeldRequest : eventHeldRequests) {
            eventHeldRequestDTOS.add(new EventHeldRequestDTO(
                    eventHeldRequest.getStatus(),
                    eventHeldRequest.getArena(),
                    eventHeldRequest.getSponsor(),
                    eventHeldRequest.getEvent()));
            eventHeldRequestRepository.save(eventHeldRequest);
        }
        return eventHeldRequestDTOS;
    }
}

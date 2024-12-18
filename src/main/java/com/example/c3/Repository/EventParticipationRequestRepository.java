// Osama Alghamdi

package com.example.c3.Repository;
import com.example.c3.Model.EventParticipationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventParticipationRequestRepository extends JpaRepository<EventParticipationRequest, Integer> {
    EventParticipationRequest findEventParticipationRequestById(Integer id);
}

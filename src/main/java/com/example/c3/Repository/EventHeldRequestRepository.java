// Osama Alghamdi

package com.example.c3.Repository;
import com.example.c3.Model.EventHeldRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventHeldRequestRepository extends JpaRepository<EventHeldRequest, Integer> {
    EventHeldRequest findEventHeldRequestById(Integer id);
}

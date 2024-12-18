
package com.example.c3.Repository;

import com.example.c3.Model.Athlete;
import com.example.c3.Model.TeammateRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeammateRequestRepository extends JpaRepository<TeammateRequest, Integer> {
    TeammateRequest findTeammateRequestById(Integer id);
    TeammateRequest findTeammateRequestBySenderAndReceiver(Athlete sender, Athlete receiver);
}

package com.example.c3.Repository;

import com.example.c3.Model.Offering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferingRepository extends JpaRepository<Offering,Integer> {
    Offering findOfferingById(Integer id);
    List<Offering> findOfferingsById(Integer id);
}
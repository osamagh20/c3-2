// Osama Alghamdi

package com.example.c3.Repository;
import com.example.c3.Model.SponsorShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorShipRepository extends JpaRepository<SponsorShip, Integer> {
    SponsorShip findSponsorShipById(Integer id);
}

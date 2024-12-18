// Osama Alghamdi

package com.example.c3.Repository;
import com.example.c3.Model.Sponsor;
import com.example.c3.Model.SponsorShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
    Sponsor findSponsorById(Integer shipId);
}

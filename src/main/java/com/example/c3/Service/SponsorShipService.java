// Osama Alghamdi

package com.example.c3.Service;
import com.example.c3.DTO.AchievementOutDTO;
import com.example.c3.DTO.AthleteOutDTO;
import com.example.c3.DTO.SponsorDTO;
import com.example.c3.DTO.SponsorShipDTO;
import com.example.c3.Model.Achievement;
import com.example.c3.Model.Athlete;
import com.example.c3.Model.Sponsor;
import com.example.c3.Model.SponsorShip;
import com.example.c3.Repository.SponsorRepository;
import com.example.c3.Repository.SponsorShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SponsorShipService {
    private final SponsorShipRepository sponsorShipRepository;

    public List<SponsorShipDTO> getAllSponsorShips() {
      List<SponsorShip> sponsorShips = sponsorShipRepository.findAll();
      List<SponsorShipDTO> sponsorShipDTOS = new ArrayList<>();
      for (SponsorShip sponsorShip : sponsorShips) {
          SponsorShipDTO sponsorShipDTO = new SponsorShipDTO(sponsorShip.getSponsorShipAmount(),
                  sponsorShip.getStatus(),sponsorShip.getStartDate(),sponsorShip.getEndDate(),
                  sponsorShip.getAthleteSponsor().getName(),sponsorShip.getAthlete().getFullName());
          sponsorShipDTOS.add(sponsorShipDTO);
      }
      return sponsorShipDTOS;
    }
}

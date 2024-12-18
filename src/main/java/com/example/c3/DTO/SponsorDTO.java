// Osama Alghamdi

package com.example.c3.DTO;
import com.example.c3.Model.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class SponsorDTO {


    private String name;
    private String phoneNumber;
    private String email;
    private String city;
    private String certificateRecord;

    private Set<SponsorShip> sponsorShipList;

}

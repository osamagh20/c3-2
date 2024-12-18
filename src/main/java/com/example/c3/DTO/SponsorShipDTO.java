// Osama Alghamdi

package com.example.c3.DTO;
import com.example.c3.Model.Athlete;
import com.example.c3.Model.Sponsor;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class SponsorShipDTO {

    private Integer sponsorShipAmount;
    private String status;
    private Date startDate;
    private Date endDate;

    private String  sponsorName;

    private String athleteName;
}

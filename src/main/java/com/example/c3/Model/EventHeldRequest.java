// Osama Alghamdi
package com.example.c3.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EventHeldRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // status should be accepted - rejected - requested
    @Column(columnDefinition = "varchar(10)")
    private String status;

    @ManyToOne
    private Arena arena;

    @ManyToOne
    private Sponsor sponsor;

    @OneToOne
    @MapsId
    private Event event;
}
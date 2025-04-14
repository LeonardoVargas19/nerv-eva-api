package org.evangelion.evacommandservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaId;
    private String model;
    private Boolean status;
    @OneToOne
    private Pilot pilot;


}

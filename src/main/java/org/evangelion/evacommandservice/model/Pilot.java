package org.evangelion.evacommandservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double synchronizationLevel;
    private Boolean status;
    @OneToOne
    @JoinColumn
    private Eva eva;


}

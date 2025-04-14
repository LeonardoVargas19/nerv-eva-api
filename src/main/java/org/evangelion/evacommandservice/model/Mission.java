package org.evangelion.evacommandservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.evangelion.evacommandservice.model.enums.Result;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String missionName;
    private LocalDateTime startDate;
    @Enumerated(EnumType.STRING)
    private Result result;
    private String report;
    @ManyToOne
    private Eva eva;
    @ManyToOne
    private Pilot pilot;


}

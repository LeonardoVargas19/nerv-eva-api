package org.evangelion.evacommandservice.dto;

import lombok.Getter;
import lombok.Setter;
import org.evangelion.evacommandservice.model.enums.Result;

import java.time.LocalDateTime;

@Getter
@Setter
public class MissionDTO {
    private Long id;
    private String missionName;
    private LocalDateTime startDate;
    private Result result;
    private String report;
    private EvaDTO eva;
    private PilotDTO pilot;

    public MissionDTO() {
    }

    public MissionDTO(Long id, String missionName, LocalDateTime startDate, Result result, String report, EvaDTO eva, PilotDTO pilot) {
        this.id = id;
        this.missionName = missionName;
        this.startDate = startDate;
        this.result = result;
        this.report = report;
        this.eva = eva;
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "MissionDTO{" +
                "id=" + id +
                ", missionName='" + missionName + '\'' +
                ", startDate=" + startDate +
                ", result=" + result +
                ", report='" + report + '\'' +
                ", eva=" + eva +
                ", pilot=" + pilot +
                '}';
    }
}

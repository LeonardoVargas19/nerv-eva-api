package org.evangelion.evacommandservice.dto;

import lombok.Getter;
import lombok.Setter;
import org.evangelion.evacommandservice.model.Pilot;

@Setter
@Getter
public class EvaDTO {
    private Long evaId;
    private String model;
    private Boolean status;
    private Pilot pilot;

    public EvaDTO() {
    }

    public EvaDTO(Long evaId, String model, Boolean status, Pilot pilot) {
        this.evaId = evaId;
        this.model = model;
        this.status = status;
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "EvaDTO{" +
                "evaId=" + evaId +
                ", model='" + model + '\'' +
                ", status=" + status +
                ", pilot=" + pilot +
                '}';
    }
}

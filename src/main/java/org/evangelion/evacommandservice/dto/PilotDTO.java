package org.evangelion.evacommandservice.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PilotDTO {
    private Long id;
    private String name;
    private Double synchronizationLevel;
    private Boolean status;
    private EvaDTO eva;

    public PilotDTO() {
    }

    public PilotDTO(Long id, String name, Double synchronizationLevel, Boolean status, EvaDTO eva) {
        this.id = id;
        this.name = name;
        this.synchronizationLevel = synchronizationLevel;
        this.status = status;
        this.eva = eva;
    }


    @Override
    public String toString() {
        return "PilotDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", synchronizationLevel=" + synchronizationLevel +
                ", status=" + status +
                ", eva=" + eva +
                '}';
    }
}

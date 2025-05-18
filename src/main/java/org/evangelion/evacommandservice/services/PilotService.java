package org.evangelion.evacommandservice.services;

import org.evangelion.evacommandservice.model.Pilot;

import java.util.List;

public interface PilotService {
    Pilot save(Pilot pilot);

    Pilot findById(Long id);

    List<Pilot> findAll();

}

package org.evangelion.evacommandservice.services;

import org.evangelion.evacommandservice.model.Mission;

import java.util.List;

public interface MissionService {
    Mission save(Mission mission);

    Mission findById(Long id);

    List<Mission> findAll();


}

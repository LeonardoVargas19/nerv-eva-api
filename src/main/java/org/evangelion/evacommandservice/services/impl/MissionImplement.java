package org.evangelion.evacommandservice.services.impl;

import org.evangelion.evacommandservice.model.Mission;
import org.evangelion.evacommandservice.repository.MissionRepository;
import org.evangelion.evacommandservice.services.MissionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MissionImplement implements MissionService {


    private final MissionRepository missionRepository;

    public MissionImplement(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    @Override
    public Mission save(Mission mission) {

        return missionRepository.save(mission);

    }

    @Override
    public Mission findById(Long id) {
        Optional<Mission> byId = missionRepository.findById(id);
        return byId.orElseThrow(() -> new NoSuchElementException("Did not meet the mission" + id));
    }

    @Override
    public List<Mission> findAll() {
        return missionRepository.findAll();
    }
}

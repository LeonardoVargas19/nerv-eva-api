package org.evangelion.evacommandservice.services.impl;

import org.evangelion.evacommandservice.model.Pilot;
import org.evangelion.evacommandservice.repository.PilotRepository;
import org.evangelion.evacommandservice.services.PilotService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PilotImplement implements PilotService {

    private final PilotRepository pilotRepository;

    public PilotImplement(PilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;
    }

    @Override
    public void save(Pilot pilot) {
        pilotRepository.save(pilot);

    }

    @Override
    public Pilot findById(Long id) {
        Optional<Pilot> optionalPilot = pilotRepository.findById(id);

        return optionalPilot.orElseThrow(() -> new NoSuchElementException("Did not meet with the pilot" + id));
    }

    @Override
    public List<Pilot> findAll() {
        return pilotRepository.findAll();
    }
}

package org.evangelion.evacommandservice.services.impl;

import org.evangelion.evacommandservice.model.Eva;
import org.evangelion.evacommandservice.repository.EvaRepository;
import org.evangelion.evacommandservice.services.EvaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EvaImplement implements EvaService {

    private final EvaRepository evaRepository;

    public EvaImplement(EvaRepository evaRepository) {
        this.evaRepository = evaRepository;
    }

    @Override
    public Eva save(Eva eva) {
        return evaRepository.save(eva);
    }

    @Override
    public Eva findById(Long id) {
        Optional<Eva> byId = evaRepository.findById(id);
        return byId.orElseThrow(() -> new NoSuchElementException("Did no meet with the Eva" + id));
    }

    @Override
    public List<Eva> findAll() {
        return evaRepository.findAll();
    }
}

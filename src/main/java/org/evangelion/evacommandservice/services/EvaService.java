package org.evangelion.evacommandservice.services;

import org.evangelion.evacommandservice.model.Eva;

import java.util.List;

public interface EvaService {
    Eva save(Eva eva);

    Eva findById(Long id);

    List<Eva> findAll();

}

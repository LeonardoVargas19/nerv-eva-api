package org.evangelion.evacommandservice.controller;

import org.evangelion.evacommandservice.model.Pilot;
import org.evangelion.evacommandservice.services.impl.PilotImplement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilot")
public class PilotController {

    private final PilotImplement pilotImplement;

    public PilotController(PilotImplement pilotImplement) {
        this.pilotImplement = pilotImplement;
    }

    @GetMapping
    public ResponseEntity<List<Pilot>> getAllPilot() {
        List<Pilot> all = pilotImplement.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pilot> getPilotById(@PathVariable Long id) {
        Pilot byId = pilotImplement.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }


    @PostMapping
    public ResponseEntity<Pilot> createPilot(@RequestBody Pilot pilot) {

        Pilot save = pilotImplement.save(pilot);

        return ResponseEntity.status(HttpStatus.CREATED).body(save);

    }


}

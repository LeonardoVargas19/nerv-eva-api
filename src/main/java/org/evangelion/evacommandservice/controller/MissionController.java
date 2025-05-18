package org.evangelion.evacommandservice.controller;

import org.evangelion.evacommandservice.model.Mission;
import org.evangelion.evacommandservice.services.impl.MissionImplement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private final MissionImplement missionImplement;

    public MissionController(MissionImplement missionImplement) {
        this.missionImplement = missionImplement;
    }

    @GetMapping
    public ResponseEntity<List<Mission>> getAllMission() {

        List<Mission> all = missionImplement.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mission> getMissionById(@PathVariable Long id) {
        Mission byId = missionImplement.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @PostMapping()
    public ResponseEntity<Mission> createMission(@RequestBody Mission mission) {
        Mission save = missionImplement.save(mission);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }


}

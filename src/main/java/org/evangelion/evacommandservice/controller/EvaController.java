package org.evangelion.evacommandservice.controller;

import org.evangelion.evacommandservice.model.Eva;
import org.evangelion.evacommandservice.services.impl.EvaImplement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eva")
public class EvaController {


    private final EvaImplement evaImplement;

    public EvaController(EvaImplement evaImplement) {
        this.evaImplement = evaImplement;
    }

    @GetMapping
    public ResponseEntity<List<Eva>> getAllEva() {
        List<Eva> all = evaImplement.findAll();

        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Eva> getEvaById(@PathVariable Long id) {

        Eva eva = evaImplement.findById(id);

        return ResponseEntity.ok(eva);
    }

    @PostMapping()
    public ResponseEntity<Eva> createEva(@RequestBody Eva eva) {

        Eva save = evaImplement.save(eva);

        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

}

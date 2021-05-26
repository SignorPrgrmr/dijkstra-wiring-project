package com.hugs4bugs.simkeshi.rest.controller;

import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.service.interfaces.PowerSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PowerSourceController {

    private final PowerSourceService service;
    @Autowired
    public PowerSourceController(PowerSourceService service) {
        this.service = service;
    }

    @PostMapping("/graph")
    public GraphNode powerSource(@RequestBody GraphNode powerSource) {
        return service.findTheOptimumSolution(powerSource);
    }
}

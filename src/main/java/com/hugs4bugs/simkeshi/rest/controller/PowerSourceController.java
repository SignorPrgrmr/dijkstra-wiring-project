package com.hugs4bugs.simkeshi.rest.controller;

import com.hugs4bugs.simkeshi.entity.GraphNode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PowerSourceController {

    @PostMapping("/graph")
    public GraphNode powerSource(@RequestBody GraphNode powerSource) {
        return null;
    }
}

package com.hugs4bugs.simkeshi.rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugs4bugs.simkeshi.core.GraphEdge;
import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.helper.GraphEdgeHelper;
import com.hugs4bugs.simkeshi.core.helper.GraphNodeHelper;
import com.hugs4bugs.simkeshi.service.interfaces.PowerSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PowerSourceController {

    private final PowerSourceService service;
    @Autowired
    public PowerSourceController(PowerSourceService service) {
        this.service = service;
    }

    @PostMapping("/graph")
    public List<GraphEdgeHelper> powerSource(@RequestParam("nodes") String nodesJson,
                                       @RequestParam("edges") String edgesJson) {
        ObjectMapper mapper = new ObjectMapper();
        List<GraphNodeHelper> nodeHelpers = new ArrayList<>();
        List<GraphEdgeHelper> edgeHelpers = null;
        try {
            List<String> nodeNames = mapper.readValue(nodesJson, new TypeReference<>() {});
            for (String name : nodeNames) {
                nodeHelpers.add(new GraphNodeHelper(name));
            }
            edgeHelpers = mapper.readValue(edgesJson, new TypeReference<>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return service.findTheOptimumSolution(nodeHelpers, edgeHelpers);
    }
}

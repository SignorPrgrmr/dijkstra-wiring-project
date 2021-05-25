package com.hugs4bugs.simkeshi.service.classes;

import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.components.PrimAlgorithm;
import com.hugs4bugs.simkeshi.service.interfaces.PowerSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerSourceServiceImpl implements PowerSourceService {

    @Autowired
    private PrimAlgorithm primAlgorithm;

    @Override
    public GraphNode findTheOptimumSolution(GraphNode head) {
    return primAlgorithm.findTheOptimumSolution(head);
    }
}

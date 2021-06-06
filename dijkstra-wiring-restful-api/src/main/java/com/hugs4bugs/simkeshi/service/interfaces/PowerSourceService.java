package com.hugs4bugs.simkeshi.service.interfaces;

import com.hugs4bugs.simkeshi.core.GraphEdge;
import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.helper.GraphEdgeHelper;
import com.hugs4bugs.simkeshi.core.helper.GraphNodeHelper;

import java.util.List;

public interface PowerSourceService {

    List<GraphEdgeHelper> findTheOptimumSolution(List<GraphNodeHelper> graphNodes, List<GraphEdgeHelper> graphEdges);
}

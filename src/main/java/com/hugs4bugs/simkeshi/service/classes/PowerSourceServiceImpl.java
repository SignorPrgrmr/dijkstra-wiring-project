package com.hugs4bugs.simkeshi.service.classes;

import com.hugs4bugs.simkeshi.core.GraphEdge;
import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.GraphNodeType;
import com.hugs4bugs.simkeshi.core.components.PrimAlgorithm;
import com.hugs4bugs.simkeshi.core.helper.GraphEdgeHelper;
import com.hugs4bugs.simkeshi.core.helper.GraphNodeHelper;
import com.hugs4bugs.simkeshi.service.interfaces.PowerSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PowerSourceServiceImpl implements PowerSourceService {

    @Autowired
    private PrimAlgorithm primAlgorithm;

    @Override
    public List<GraphEdgeHelper> findTheOptimumSolution(List<GraphNodeHelper> graphNodes, List<GraphEdgeHelper> graphEdges) {
        GraphNode head = primAlgorithm.findTheOptimumSolution(createGraph(graphNodes, graphEdges));
        return getGraphEdges(head);
    }

    private GraphNode createGraph(List<GraphNodeHelper> nodeHelpers, List<GraphEdgeHelper> edgeHelpers) {
        Map<String, GraphNode> map = new HashMap<>();
        GraphNode head = null;
        for (GraphNodeHelper nodeHelper : nodeHelpers) {
            GraphNode node = nodeHelper.convert();
            map.put(nodeHelper.getName(), node);
            if (node.getType() == GraphNodeType.POWER_SOURCE)
                head = node;
        }
        for (GraphEdgeHelper edgeHelper : edgeHelpers) {
            map.get(edgeHelper.getFirstNode()).addAdjacent(map.get(edgeHelper.getSecondNode()), edgeHelper.getCost());
        }
        return head;
    }

    private List<GraphEdgeHelper> getGraphEdges(GraphNode head) {
        Set<GraphEdge> foundEdges = new HashSet<>();
        List<GraphNode> selectedNodes = new LinkedList<>();
        selectedNodes.add(head);
        while (selectedNodes.size() > 0) {
            GraphNode pointer = selectedNodes.remove(0);
            for (GraphEdge edge : pointer.getEdges()) {
                if (!foundEdges.contains(edge)) {
                    selectedNodes.add(edge.getAdjacent(pointer));
                    foundEdges.add(edge);
                }
            }
        }
        List<GraphEdgeHelper> result = new LinkedList<>();
        for (GraphEdge edge : foundEdges) {
            result.add(edge.getHelper());
        }
        return result;
    }

}

package com.hugs4bugs.simkeshi.service.classes;

import com.hugs4bugs.simkeshi.core.GraphEdge;
import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.components.DijkstraAlgorithm;
import com.hugs4bugs.simkeshi.core.helper.GraphEdgeHelper;
import com.hugs4bugs.simkeshi.core.helper.GraphNodeHelper;
import com.hugs4bugs.simkeshi.image.ImageGraphImp;
import com.hugs4bugs.simkeshi.service.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private DijkstraAlgorithm dijkstraAlgorithm;

    @Autowired
    private ImageGraphImp imageGraphImp;

    @Override
    public Map<String, List<Object>> findTheOptimumSolution(int name) {
        GraphNode head = getGraphFromImage(name);
        int size = graphSize(head);
        head = dijkstraAlgorithm.findTheOptimumSolution(head, size);
        return null;
    }

    private Map<String, List<Object>> getMappedData(GraphNode head) {
        List<GraphEdgeHelper> graphEdgeHelpers = getGraphEdges(head);
        List<GraphNodeHelper> graphNodeHelpers = getGraphNodes(head);
        List<Object> edgeList = new LinkedList<>();
        List<Object> nodeList = new LinkedList<>();
        for (GraphEdgeHelper helper : graphEdgeHelpers)
            edgeList.add(helper);
        for (GraphNodeHelper helper : graphNodeHelpers)
            nodeList.add(helper);
        Map<String, List<Object>> map = new HashMap<>();
        map.put("nodes : ", nodeList);
        map.put("edges : ", edgeList);
        return map;
    }

    private List<GraphNodeHelper> getGraphNodes(GraphNode head) {
        Set<GraphNode> foundNode = new HashSet<>();
        List<GraphNode> selectedNodes = new LinkedList<>();
        foundNode.add(head);
        selectedNodes.add(head);
        while (selectedNodes.size() > 0) {
            GraphNode pointer = selectedNodes.remove(0);
            for (GraphNode node : pointer.adjacentNodes()) {
                if (!foundNode.contains(node)) {
                    selectedNodes.add(node);
                    foundNode.add(node);
                }
            }
        }
        List<GraphNodeHelper> result = new LinkedList<>();
        for (GraphNode node : foundNode) {
            result.add(helper(node));
        }
        return result;
    }

    private GraphNodeHelper helper(GraphNode node) {
        GraphNodeHelper helper = new GraphNodeHelper(node.getName());
        return helper;
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



    public GraphNode image_1() {
        return imageGraphImp.image_1();
    }

    public GraphNode image_2() {
        return imageGraphImp.image_2();
    }

    public GraphNode image_3() {
        return imageGraphImp.image_3();
    }

    public GraphNode image_4() {
        return imageGraphImp.image_4();
    }

    public GraphNode image_5() {
        return imageGraphImp.image_5();
    }

    public GraphNode image_6() {
        return imageGraphImp.image_6();
    }

    public GraphNode image_7() {
        return imageGraphImp.image_7();
    }

    public GraphNode image_8() {
        return imageGraphImp.image_8();
    }

    public GraphNode image_9() { return imageGraphImp.image_9(); }

    public GraphNode image_11() {
        return imageGraphImp.image_11();
    }

    public GraphNode image_12() {
        return imageGraphImp.image_12();
    }

    public GraphNode image_13() {
        return imageGraphImp.image_13();
    }

    public GraphNode image_14() {
        return imageGraphImp.image_14();
    }

    public GraphNode image_17() {
        return imageGraphImp.image_17();
    }

    public GraphNode image_18() {
        return imageGraphImp.image_18();
    }

    public GraphNode image_19() {
        return imageGraphImp.image_19();
    }

    public GraphNode image_20() {
        return imageGraphImp.image_20();
    }

    private static int graphSize(GraphNode head) {
        List<GraphNode> nodeList = null;
        List<GraphEdge> edgeList = null;
        List<GraphEdge> headEdges = head.getEdges();
        nodeList.add(head);
        for (GraphEdge edge : headEdges) {
            edgeList.add(edge);
            secondNodeEdges(edge, edgeList, nodeList, head);
        }
        return nodeList.size();
    }

    private static void secondNodeEdges(GraphEdge edge, List<GraphEdge> edgeList, List<GraphNode> nodeList, GraphNode startNode) {
        GraphNode secondNode;
        List<GraphEdge> currentEdges = null;
        if (edge.getFirstNode() == startNode)
            secondNode = edge.getSecondNode();
        else secondNode = edge.getFirstNode();
        if (!nodeList.contains(secondNode)) {
            nodeList.add(secondNode);
            for (GraphEdge currentEdge : secondNode.getEdges()) {
                currentEdges.add(currentEdge);
                if (!edgeList.contains(currentEdge)) {
                    edgeList.add(currentEdge);
                    secondNodeEdges(currentEdge, edgeList, nodeList, secondNode);
                }
            }
        }
    }

    private GraphNode getGraphFromImage(int name) {
        GraphNode graphNode;
        switch (name){
            case 1:
                graphNode = imageGraphImp.image_1();
                break;
            case 2:
                graphNode = imageGraphImp.image_2();
                break;
            case 3:
                graphNode = imageGraphImp.image_3();
                break;

            case 4:
                graphNode = imageGraphImp.image_4();
                break;
            case 5:
                graphNode = imageGraphImp.image_5();
                break;
            case 6:
                graphNode = imageGraphImp.image_6();
                break;
            case 7:
                graphNode = imageGraphImp.image_7();
                break;
            case 8:
                graphNode = imageGraphImp.image_8();
                break;
            case 9:
                graphNode = imageGraphImp.image_9();
                break;
            case 11:
                graphNode = imageGraphImp.image_11();
                break;
            case 12:
                graphNode = imageGraphImp.image_12();
                break;
            case 13:
                graphNode = imageGraphImp.image_13();
                break;
            case 14:
                graphNode = imageGraphImp.image_14();
                break;
            case 17:
                graphNode = imageGraphImp.image_17();
                break;
            case 18:
                graphNode = imageGraphImp.image_18();
                break;
            case 19:
                graphNode = imageGraphImp.image_19();
                break;
            case 20:
                graphNode = imageGraphImp.image_20();
                break;
            default:
                graphNode = null;
        }
        return graphNode;
    }
}

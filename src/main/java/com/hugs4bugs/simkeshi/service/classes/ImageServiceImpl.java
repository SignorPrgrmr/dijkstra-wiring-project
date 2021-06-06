package com.hugs4bugs.simkeshi.service.classes;

import com.hugs4bugs.simkeshi.core.GraphEdge;
import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.components.DijkstraAlgorithm;
import com.hugs4bugs.simkeshi.image.ImageGraphImp;
import com.hugs4bugs.simkeshi.service.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private DijkstraAlgorithm dijkstraAlgorithm;

    @Autowired
    private ImageGraphImp imageGraphImp;

    @Override
    public GraphNode findTheOptimumSolution(GraphNode head) {
        int size = graphSize(head);
        return dijkstraAlgorithm.findTheOptimumSolution(head, size);
    }

    @Override
    public GraphNode image_1() {
        return imageGraphImp.image_1();
    }

    @Override
    public GraphNode image_2() {
        return imageGraphImp.image_2();
    }

    @Override
    public GraphNode image_3() {
        return imageGraphImp.image_3();
    }

    @Override
    public GraphNode image_4() {
        return imageGraphImp.image_4();
    }

    @Override
    public GraphNode image_5() {
        return imageGraphImp.image_5();
    }

    @Override
    public GraphNode image_6() {
        return imageGraphImp.image_6();
    }

    @Override
    public GraphNode image_7() {
        return imageGraphImp.image_7();
    }

    @Override
    public GraphNode image_8() {
        return imageGraphImp.image_8();
    }

    @Override
    public GraphNode image_9() { return imageGraphImp.image_9(); }

    @Override
    public GraphNode image_11() {
        return imageGraphImp.image_11();
    }

    @Override
    public GraphNode image_12() {
        return imageGraphImp.image_12();
    }

    @Override
    public GraphNode image_13() {
        return imageGraphImp.image_13();
    }

    @Override
    public GraphNode image_14() {
        return imageGraphImp.image_14();
    }

    @Override
    public GraphNode image_17() {
        return imageGraphImp.image_17();
    }

    @Override
    public GraphNode image_18() {
        return imageGraphImp.image_18();
    }

    @Override
    public GraphNode image_19() {
        return imageGraphImp.image_19();
    }

    @Override
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

    @Override
    public GraphNode getGraphFromImage(int name) {
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

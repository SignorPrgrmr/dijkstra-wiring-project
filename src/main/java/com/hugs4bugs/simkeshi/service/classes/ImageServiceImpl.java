package com.hugs4bugs.simkeshi.service.classes;

import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.components.DijkstraAlgorithm;
import com.hugs4bugs.simkeshi.image.ImageGraphImp;
import com.hugs4bugs.simkeshi.service.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    private int graphSize(GraphNode head){
        return 0;
    }
}

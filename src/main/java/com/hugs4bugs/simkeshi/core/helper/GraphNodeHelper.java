package com.hugs4bugs.simkeshi.core.helper;

import com.hugs4bugs.simkeshi.core.GraphNode;
import com.hugs4bugs.simkeshi.core.GraphNodeType;

public class GraphNodeHelper {

    private final String name;

    public GraphNodeHelper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public GraphNode convert() {
        GraphNodeType type = null;
        switch (name.charAt(0)) {
            case 'P':
                type = GraphNodeType.POWER_SOURCE;
                break;
            case 'J':
                type = GraphNodeType.JUNCTION_BOX;
                break;
            case 'S':
                type = GraphNodeType.SWITCH;
                break;
        }
        return new GraphNode(name, type);
    }

    @Override
    public String toString() {
        return "GraphNodeHelper{" +
                "name='" + name + '\'' +
                '}';
    }
}

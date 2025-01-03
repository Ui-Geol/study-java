package graph;

import java.util.ArrayList;
import java.util.List;

//벨만-포드, 크루스칼 알고리즘에서 사용

public class EdgeList {

    private List<int[]> edgeList;

    public EdgeList() {
        edgeList = new ArrayList<>();
    }

    public void addEdge(int u, int v) {
        edgeList.add(new int[]{u, v});
    }

    public void printEdges() {
        for (int[] edge : edgeList) {
        System.out.println("Edge: " + edge[0] + " -> " + edge[1]);
        }
    }

    public List<int[]> getEdges() {
        return edgeList;
    }

}

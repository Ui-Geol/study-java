package graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    private List<List<Integer>> adjacencyList;
    private int numOfNodes;

    public AdjacencyList(int numOfNodes) {
        this.numOfNodes = numOfNodes;
        adjacencyList = new ArrayList<>();
        // 각 정점에 빈 리스트를 할당
        for (int i = 0; i < numOfNodes; i++) {
        adjacencyList.add(new ArrayList<>());
        }
    }
    //간선 추가
    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }
    //인접 리스트 출력
    public void printAdjacencyList() {
        for (int i = 0; i < numOfNodes; i++) {
        System.out.print("Vertex " + i + ":");
        for (int neighbor : adjacencyList.get(i)) {
            System.out.print(" -> " + neighbor);
        }
        System.out.println();
        }
    }
}

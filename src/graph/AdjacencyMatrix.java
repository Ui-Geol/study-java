package graph;

import java.util.Arrays;

public class AdjacencyMatrix {
    private int[][] adjacencyMetrix;
    private int numOfNodes;

    public AdjacencyMatrix(int numOfNodes) {
        this.numOfNodes = numOfNodes;
        // 정점 개수에 맞는 인접 행렬 초기화
        adjacencyMetrix = new int[numOfNodes][numOfNodes];
    }
    // 무가중치 간선 추가
    public void addEdge(int u, int v) {
        adjacencyMetrix[u][v] = 1;
        adjacencyMetrix[v][u] = 1;
    }
    // 가중치 간선 추가
    public void addWeightedEdge(int u, int v, int weight) {
        adjacencyMetrix[u][v] = weight;
        adjacencyMetrix[v][u] = weight;
    }
    // 인접 행렬 출력
    public void printAdjacencyMatrix() {
        for (int i = 0; i < numOfNodes; i++) {
        System.out.println(Arrays.toString(adjacencyMetrix[i]));
        }
    }
}

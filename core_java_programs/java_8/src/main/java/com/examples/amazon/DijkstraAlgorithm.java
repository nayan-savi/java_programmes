package com.examples.amazon;

import java.util.Arrays;

public class DijkstraAlgorithm {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int source = 0;
        DijkstraAlgorithm d = new DijkstraAlgorithm();
        d.dijkstra(graph, source);
    }

    private void dijkstra(int[][] graph, int source) {
        boolean[] visited = new boolean[graph.length];
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        // source index will always zero
        dist[source] = 0;
        for (int i = 0; i < graph.length; i++) {
            int u = minDistance(visited, dist);
            visited[u] = true;
            for (int v = 0; v < graph.length; v++) {
                int weight = graph[u][v];
                if(!visited[v] && dist[u] != Integer.MAX_VALUE && weight != 0 && dist[u] + weight <  dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }

    private int minDistance(boolean[] visited, int[] nodes) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i] && nodes[i] <= min) {
                min = nodes[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}

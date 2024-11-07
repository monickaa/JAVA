import java.util.*;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addedge(int a, int b) {
        adjList[a].add(b);
        adjList[b].add(a);
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        System.out.println("We are starting BFS from: " + start);

        while (!q.isEmpty()) {
            int vertex = q.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 3);
        g.addedge(2, 4);
        g.addedge(3, 5);
        g.addedge(4, 5);
        g.bfs(0);
    }
}

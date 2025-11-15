import java.util.*;

class Edge {
    int to;
    int weight;

    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}
public class DFS{

public static boolean[] visited = new boolean[5];
public static ArrayList<Edge>[] graph = new ArrayList[5];
    public static void main(String[] args) {

        int nodes = 5;

        for (int i = 0; i < nodes; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(2, 4));
        graph[1].add(new Edge(3, 3));
        graph[2].add(new Edge(4, 1));

        visited[0] = true;
        dfs(0);
    }
    public static void dfs(int current){
        System.out.println(current);
        int size = graph[current].size();
        for(int i = 0; i<size; ++i){
            if(!visited[graph[current].get(i).to]){
                visited[graph[current].get(i).to] = true;
                dfs(graph[current].get(i).to);
            }
        }
    }
}

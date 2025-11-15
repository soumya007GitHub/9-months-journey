import java.util.*;

class Edge {
    int to;
    int weight;

    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class HasPath{
public static boolean[] visited = new boolean[7];
public static ArrayList<Edge>[] graph = new ArrayList[7];
    public static void main(String[] args) {

        int nodes = 7;

        for (int i = 0; i < nodes; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(2, 4));
        graph[1].add(new Edge(0, 3));
        graph[1].add(new Edge(3, 3));
        graph[2].add(new Edge(0, 1));
        graph[2].add(new Edge(4, 1));
        graph[3].add(new Edge(1, 1));
        graph[3].add(new Edge(4, 1));
        graph[3].add(new Edge(5, 1));
        graph[4].add(new Edge(2, 1));
        graph[4].add(new Edge(3, 1));
        graph[4].add(new Edge(5, 1));
        graph[5].add(new Edge(3, 1));
        graph[5].add(new Edge(4, 1));
        graph[5].add(new Edge(6, 1));
        graph[6].add(new Edge(5, 1));

        int source = 0;
        int destination = 10;

        visited[0] = true;
        System.out.println(dfs(source, destination));
    }
    public static boolean dfs(int source, int destination){
        if(source == destination){
            visited[source] = true;
            return true;
        }
        visited[source] = true;
        int size = graph[source].size();
        // 2
        for(int i = 0; i<size; ++i){
            if(!visited[graph[source].get(i).to] && dfs(graph[source].get(i).to, destination)){
                return true;
            }
        }
        return false;
    }
}

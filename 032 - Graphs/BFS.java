import java.util.*;

class Edge {
    int to;
    int weight;

    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class BFS{
    public static void main(String[] args) {

        int nodes = 5;
        ArrayList<Edge>[] graph = new ArrayList[nodes];

        for (int i = 0; i < nodes; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(2, 4));
        graph[1].add(new Edge(3, 3));
        graph[2].add(new Edge(4, 1));

        boolean[] visited = new boolean[nodes];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);

        while(!queue.isEmpty()){
            int removed = queue.remove();
            if(!visited[removed]){
                System.out.println(removed);
                visited[removed] = true;
                for(int i = 0; i<graph[removed].size(); ++i){
                    queue.add(graph[removed].get(i).to);
                }
            }
        }
    }
}

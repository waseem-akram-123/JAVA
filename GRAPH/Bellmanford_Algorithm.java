import java.util.ArrayList;

public class Bellmanford_Algorithm {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge (int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph (ArrayList <Edge> graph[]){
        // intializing the array (null --> empty)
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add (new Edge (0,1,2));
        graph[0].add (new Edge (0,2,4));

        graph[1].add (new Edge (1,2,-4));

        graph[2].add (new Edge (2,3,2));

        graph[3].add (new Edge (3,4,4));

        graph[4].add (new Edge (4,1,-1));
    }
    public static void bellmanford (ArrayList <Edge> graph[], int src, int v){

        int dist[] = new int[v];
        for (int i=0; i<v; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int k=0; k<v-1; k++){   // loop runs for v-1 times
            for (int i=0; i<v; i++){  // sare nodes ke liye
                for (int j=0; j<graph[j].size(); j++){  // neighbours ke liye
                    Edge e = graph[i].get(j);

                    int U = e.src;
                    int V = e.dest;

                    if (dist[U] != Integer.MAX_VALUE && dist[U]+e.wt < dist[V]){
                        dist[V] = dist[U]+e.wt;
                    }
                }
            }
        }
        for (int i=0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList <Edge> graph[] = new ArrayList [v];

        createGraph(graph);

        bellmanford(graph, 0, v);
        
    }
}

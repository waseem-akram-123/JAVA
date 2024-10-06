import java.util.*;
public class Dijkstras_Algorithm {
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
     static class Pair implements Comparable <Pair>{
        int node;
        int dist;

        public Pair (int n, int d){
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo (Pair p2){
            return this.dist - p2.dist;
        }
    }
    public static void createGraph (ArrayList <Edge> graph[]){
        // intializing the array (null --> empty)
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add (new Edge (0,1,2));
        graph[0].add (new Edge (0,2,4));

        graph[1].add (new Edge (1,3,7));
        graph[1].add (new Edge (1,2,1));

        graph[2].add (new Edge (2,4,3));

        graph[3].add (new Edge (3,5,1));

        graph[4].add (new Edge (4,3,2));
        graph[4].add (new Edge (4,5,5));
    }
    public static void dijkstras (ArrayList <Edge> graph[], int src, int v){

        PriorityQueue <Pair> pq = new PriorityQueue<>();
        pq.add (new Pair (0,0));     // adding 1st pair to priority queue

        int dist[] = new int [v];
        for (int i=0; i<v; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[v];

        while (!pq.isEmpty()){
            Pair curr = pq.remove();      // removing the first pair  --> pq gives the smallest distance pair

            if (vis[curr.node] == false){    // making visited to true for the first pair
                vis[curr.node] = true;

                for (int i=0; i<graph[curr.node].size(); i++){    // updating the distance of neighbours
                    Edge e = graph[curr.node].get(i);

                    int U = e.src;
                    int V = e.dest;  // capital V hai

                    if (dist[U]+ e.wt < dist[V]){
                        dist[V] = dist[U]+ e.wt;
                        pq.add (new Pair (V, dist[V]));
                    }
                }
            }
        }
        for (int i=0; i<v; i++){
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList <Edge> graph[] = new ArrayList [v];

        createGraph(graph);

        dijkstras(graph, 0, v);
    }
}

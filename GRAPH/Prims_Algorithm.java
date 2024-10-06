import java.util.*;
public class Prims_Algorithm {
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
        int cost;

        public Pair (int n, int c){
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo (Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void createGraph (ArrayList <Edge> graph[]){
        // intializing the array (null --> empty)
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add (new Edge (0,1,10));
        graph[0].add (new Edge (0,2,15));
        graph[0].add (new Edge (0,3,30));

        graph[1].add (new Edge (1,0,10));
        graph[1].add (new Edge (1,3,40));

        graph[2].add (new Edge (2,0,15));
        graph[2].add (new Edge (2,3,50));

        graph[3].add (new Edge (3,1,40));
        graph[3].add (new Edge (3,2,50));
    }
    public static void prims (ArrayList <Edge> graph[], int v){
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        pq.add (new Pair (0,0));

        boolean vis[] = new boolean[v];

        int mstcost = 0;

        while (!pq.isEmpty()){
            Pair curr = pq.remove();

            if (vis[curr.node] == false){
                vis[curr.node] = true;
                mstcost = mstcost + curr.cost;

                for (int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);

                    if (vis[e.dest] == false){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("minimum mst cost is :" + mstcost);
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList <Edge> graph[] = new ArrayList [v];

        createGraph(graph);

        prims(graph, v);


    }
}

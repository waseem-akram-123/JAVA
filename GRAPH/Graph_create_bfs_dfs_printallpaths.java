import java.util.*;
public class Graph_create_bfs_dfs_printallpaths {
    static class Edge {
        int src;
        int dest;
        public Edge (int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph (ArrayList <Edge> graph[]){
        // intializing the array (null --> empty)
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add (new Edge (0,1));
        graph[0].add (new Edge (0,2));

        graph[1].add (new Edge (1,0));
        graph[1].add (new Edge (1,3));

        graph[2].add (new Edge (2,0));
        graph[2].add (new Edge (2,4));

        graph[3].add (new Edge (3,1));
        graph[3].add (new Edge (3,4));
        graph[3].add (new Edge (3,4));

        graph[4].add (new Edge (4,2));
        graph[4].add (new Edge (4,3));
        graph[4].add (new Edge (4,5));

        graph[5].add (new Edge (5,3));
        graph[5].add (new Edge (5,4));
        graph[5].add (new Edge (5,6));

        graph[6].add (new Edge (6,5));
    }
    // breadth first search --> similar to level order traversal of BST
    public static void bfs (ArrayList <Edge> graph[], int v){
        Queue <Integer> q = new LinkedList <>();
        boolean vis[] = new boolean[v];

        q.add (0);

        while (!q.isEmpty()){
            int curr = q.remove();

            if (vis[curr] == false){
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get (i);
                    q.add (e.dest);
                }
            }
        }
    }
    //depth first search
    public static void dfs (ArrayList <Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if (vis[e.dest] == false){
                dfs(graph, e.dest, vis);
            }
        }
    }
    // print all paths from source to target
    public static void printAllPath (ArrayList <Edge> graph[], int curr, boolean vis[], String path, int tar){
        if (curr == tar){
            System.out.println(path + " ");
            return;
        }
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if (vis[e.dest] == false){
                vis[curr] = true;
                printAllPath(graph, e.dest, vis, path+e.dest, tar);
                vis[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList <Edge> graph[] = new ArrayList [v];

        createGraph(graph);

        // print 2's neighbours
        for (int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + "0");
        }
        System.out.println();

        //bfs
        bfs (graph, v);
        System.out.println();

        //dfs
        dfs(graph, 0, new boolean[v]);
        System.out.println();

        // print all path
        int src = 0, tar = 5;
        printAllPath(graph, src, new boolean[v], " ", tar);

    }
}

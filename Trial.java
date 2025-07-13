import java.util.*;
public class Trial{
    static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src=src;
            this.dest=dest;
           
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
       
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        //graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        graph[4].add(new Edge(4,0));
        //graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,4));
       
        
   }
   public static boolean cycle(ArrayList<Edge>graph[],int curr,int parent,boolean vis[]){
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e= graph[curr].get(i);
        if(vis[e.dest]&&e.dest!=parent){
            return true;
        }
        if(!vis[e.dest]){
            if(cycle(graph, e.dest, curr, vis)){
                return true;
            }
        }
    }
    return false;
   }
   
   
    public static void main(String args[]){
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]= new ArrayList[v];
        createGraph(graph);
        boolean visited[]= new boolean [v];
        for(int i=0;i<v;i++){
            if(visited[i]==false){
               boolean val=cycle(graph,i,-1,visited);
               if(val){
                System.out.println(val);
                return;
               }
        }      
    }
    System.out.println(false);
   
}
}
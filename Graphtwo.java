import java.util.*;
public class Graphtwo {
    public static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[],int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
       // graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        graph[4].add(new Edge(4,0));
        //graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,4));
      
    }
    

   public static boolean cycleDetectU(ArrayList<Edge>graph[],boolean visited[],int curr,int parent){
    visited[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(!visited[e.dest]){
            if(cycleDetectU(graph, visited, e.dest, curr)){
                return true;
            }
        }
        else if(visited[e.dest]&&e.dest!=parent){
            return true;
        }
    }
     return false;

   }

    public static void main(String args[]){
        int v=6;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph,v);
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(visited[i]!=true){
           boolean val= cycleDetectU(graph, visited, i, -1);
         
            System.out.println(val);
            
           }
            }
        }
       
        
    }


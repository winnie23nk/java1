
    //A node is called a vertex and two vertices are connected through an edge.

    //There are two types of edges unidirectional and bidirectional,unidirectional can be represented through arrow whereas bi can be simply represented through a line.

    //Graphs can be of two types directed and undirected and also the edges can have weights, weight can be time or distance.

    //There are 4 ways of storing a graph
    //1)Adjacency list(List of list of vertices and edges)
    //2)adjacency matrix
    //3)Edge List
    //4)2D Matrix (Implicit Graph)

    //The vertices that u can reach from a vertex with a direct connection are called neighbours.

    //adjacency list can be implemented through array of array list or hashmap

    //We will implement it like ArrayList<Edge>graph[v] (Arraylist which will store value of type edge of each vertex and array will store arraylist of each vertex and such an array is a graph).

    //If we make use of an adjacency matrix then each entry can either be 0 denoting no edge and 1 denoting edge, if its a weighted graph then instead of 1 we enter the weight.

    //In edge list we just store all possible edges with weights in the form of arraylist.

    //In Implicit graph each grid in the 2d matrix represents a vertex and we can move in 4 directions around that grid to get its neighbours except the corner grid

    //Time complexity of BFS and DFS is O(V+E)
import java.util.*;
import java.util.Queue;
public class Graph {

    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        //Initially array will have null values(Garbage values) so lets create arraylist in each node to have empty array values where we can store values

        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));


    }
    public static void bfs(ArrayList<Edge>graph[],boolean visited[],int start){
      
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

        

    }
    public static void dfs(ArrayList<Edge>graph[],boolean visited[],int curr){
        System.out.println(curr);
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(visited[e.dest]==false){
                dfs(graph,visited,e.dest);
            }

        }
    }
    public static void allpath(ArrayList<Edge>graph[],boolean visited[],int curr,int target,String path){
        if(curr==target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(visited[e.dest]==false){
                visited[curr]=true;
                allpath(graph,visited,e.dest,5,path+e.dest);
                visited[curr]=false;
            }
        }

    }
    public static void main(String args[]){
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph);

        //print 2's neighbours
        /*for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }*/
       boolean visited[]= new boolean[v];
       /*for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            bfs(graph,visited,i);
        }
       }*///bfs

      /*for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            dfs(graph,visited,i);
        }
      }*///dfs

    
           allpath(graph,visited,0,5,"0");
            
       
      


    }
    
}

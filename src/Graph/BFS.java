package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    int v;
    int[][] adj;

    //********** constructor *********
    BFS(int v){
        this.v=v;
        adj=new int[v][v];
    }

    //*********************** function to add edge ******************************************
    public void addEdge(int src,int des){
        adj[src][des]=1;
        adj[des][src]=1;
    }

    //******************************************** bfs *******************************************************8

    public void bfs(int node){
        Queue<Integer> q=new LinkedList<>();
        boolean[] isVisited = new boolean[v];
        q.add(node);
        isVisited[node]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr + " ");
            for(int i=0;i<v;i++){
                if(adj[i][curr]==1 && isVisited[i]!=true){
                    isVisited[i]=true;
                    q.add(i);
                }
            }
        }

    }

    //****************************** main function *********************************************

    public static void main(String[] args){
        BFS obj=new BFS(5);
        obj.addEdge(0,1);
        obj.addEdge(1,2);
        obj.addEdge(2,3);
        obj.addEdge(1,3);

        obj.bfs(2);

    }
}

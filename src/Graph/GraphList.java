package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphList {
    public int v;
    public List<List<Integer>> adj;  //can make linked list or arraylist

    //******** constructor *********
    GraphList(int v){
        this.v=v;
        adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }

    //**************** add edges ***********************

    public void addEdge(int src,int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    //**************** dfs *******************

    public void dfs(int node){
        Stack<Integer> st=new Stack<>();
        boolean[] isVisited = new boolean[v];
        st.push(node);

        //for traversing disconnected components i need a loop from 0 to no.of nodes in which we call dfs for each node

        while(!st.isEmpty()){
            int top=st.pop();
            if(isVisited[top]!=true){
                System.out.print(top+" ");
                isVisited[top]=true;
            }
            for(Integer neighbour : adj.get(top)){
                if(!isVisited[neighbour]){
                    st.push(neighbour);
                }
            }
        }
    }

    //*************** main function *****************

    public static void main(String[] args){
        GraphList obj= new GraphList(6);
        obj.addEdge(0,1);
        obj.addEdge(1,2);
        obj.addEdge(4,3);
        obj.addEdge(1,3);
        obj.addEdge(4,5);

        obj.dfs(0);
    }
}

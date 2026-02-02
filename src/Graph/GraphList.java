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

    //**************** dfs *******************

    public void dfs(int node){
        Stack<Integer> st=new Stack<>();
        boolean[] isVisited = new boolean[v];
        st.push(node);
        isVisited[node]=true;
        while(!st.isEmpty()){
            int top=st.peek();
            System.out.print(top+" ");
            for(Integer neighbour : adj.get(top)){
                if()
            }
        }
    }

    //*************** main function *****************
}

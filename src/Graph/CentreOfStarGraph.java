package Graph;

import java.util.HashMap;
import java.util.Map;

public class CentreOfStarGraph {
    public int findCenter(int[][] edges) {
        //******* hashmap is used to count degree (similar to frequency) ***********

        Map<Integer,Integer> map=new HashMap<>();
        int v=edges.length;
        for(int i=0;i<v;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.put(v1,map.getOrDefault(v1,0)+1);
            map.put(v2,map.getOrDefault(v2,0)+1);
            if(map.get(v1)==v){
                return v1;
            }
            if(map.get(v2)==v){
                return v2;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[][] edges={{1,2},{2,3},{4,2}};

        CentreOfStarGraph obj=new CentreOfStarGraph();
        int ans= obj.findCenter(edges);
        System.out.print("Centre of the graph is: " + ans);
    }
}

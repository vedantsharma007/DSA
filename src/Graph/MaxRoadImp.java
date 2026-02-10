package Graph;
import java.util.Arrays;

//learned a useful pattern today that using 1D array in graph problems is easy and reduce time complexity as compare to map

//*****************************************QUESTION***************************************************
//You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.
//
//        You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes
//        that there exists a bidirectional road connecting cities ai and bi.
//        You need to assign each city with an integer value from 1 to n, where each value can only be used once.
//        The importance of a road is then defined as the sum of the values of the two cities it connects.
//        Return the maximum total importance of all roads possible after assigning the values optimally.
//**************************************Solution*************************************************

//approach-- count no of edges of vertex and assign number according to no of edges
//more no. of edges=assign high number.
public class MaxRoadImp {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree=new long[n];
        for(int[] r:roads){
            degree[r[0]]++;
            degree[r[1]]++;
        }
        Arrays.sort(degree);
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=(i+1)*degree[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] roads={{1,2},{2,3},{2,0},{0,1},{1,3},{2,4}};
        int n=5;

        MaxRoadImp obj=new MaxRoadImp();
        long ans= obj.maximumImportance(n,roads);

        System.out.print("Maximum total Importance is: "+ans);
    }
}

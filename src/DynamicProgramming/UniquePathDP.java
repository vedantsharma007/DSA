package DynamicProgramming;

import java.util.Arrays;

public class UniquePathDP {

    public int noOfPaths(int sr,int sc,int tr,int tc){

        int[][] matrix=new int[tr][tc];
        for(sr=0;sr<tr;sr++){
            for(sc=0;sc<tc;sc++){
                if(sr==0 || sc==0){
                    matrix[sr][sc]=1;
                }
                else{
                    matrix[sr][sc]=matrix[sr-1][sc]+matrix[sr][sc-1];
                }
            }
        }
        return matrix[tr-1][tc-1];
    }

    public static void main(String[] args){
        int sr=1,sc=1; //start row and start column
        int tr=2,tc=3; //target row and target column
        String s="";
        UniquePathDP obj= new UniquePathDP();
        int count= obj.noOfPaths(sr,sc,tr,tc);

        System.out.println("no of ways to reach target is: "+count);
    }
}

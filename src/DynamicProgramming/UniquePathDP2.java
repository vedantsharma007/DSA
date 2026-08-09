package DynamicProgramming;

public class UniquePathDP2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        int[][] matrix=new int[m][n];
        matrix[0][0]=1;
        for(int sr=0;sr<m;sr++){
            for(int sc=0;sc<n;sc++){
                if(obstacleGrid[sr][sc]==1) continue;
                if(sr>0) matrix[sr][sc]+=matrix[sr-1][sc];
                if(sc>0) matrix[sr][sc]+=matrix[sr][sc-1];
            }
        }
        return matrix[m-1][n-1];
    }
    public static void main(String[] args){
        int[][] obstacle = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        UniquePathDP2 obj= new UniquePathDP2();
        int count= obj.uniquePathsWithObstacles(obstacle);

        System.out.println("no of ways to reach target is: "+count);
    }
}

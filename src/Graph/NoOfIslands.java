package Graph;
//approach: sumply traverse the matrix and count the dfs/bfs call and return

public class NoOfIslands {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length,n=grid[0].length;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    island(grid,i,j,visited);
                }

            }
        }
        return count;
    }
    public void island(char[][] grid,int i,int j,boolean[][] visited){
        if(i<0 || i==grid.length || j<0 || j==grid[0].length || grid[i][j]=='0' || visited[i][j]){
            return ;
        }
        visited[i][j]=true;
        island(grid,i+1,j,visited);

        island(grid,i-1,j,visited);

        island(grid,i,j-1,visited);

        island(grid,i,j+1,visited);

    }
    public static void main(String[] args){
        char[][] grid = {
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '1', '0', '0'}
        };

        NoOfIslands obj = new NoOfIslands();
        int ans= obj.numIslands(grid);
        System.out.print("answer is: "+ans);
    }
}

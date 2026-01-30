package BackTracking;



public class fourDirectionMaze {
    //************************************mainFunction***************************************************************//
    public static void main(String[] args){
        int rows = 3, cols = 3;         // matrix size
        int sr = 0, sc = 0;             // start row and start column
        int tr = rows - 1, tc = cols - 1; //target row and target column

        boolean[][] isVisited=new boolean[rows][cols];

        fourDirectionMaze obj= new fourDirectionMaze();
        int count= obj.noOfPath(sr,sc,tr,tc,isVisited);


        fourDirectionMaze obj1= new fourDirectionMaze();
        obj1.printPath(sr,sc,tr,tc,"",isVisited);

        System.out.println("no of ways to reach target is: "+count);
    }

    //************************************count no of paths***************************************************************//
    public int noOfPath(int sr,int sc,int tr,int tc,boolean[][] isVisited){
        int rows = isVisited.length, cols = isVisited[0].length;
        if(sr>=rows || sc>=cols || sc<0 || sr<0) return 0;
        if(sr==tr && sc==tc) return 1;
        if(isVisited[sr][sc]) return 0;

        isVisited[sr][sc]=true;

        int count=
        noOfPath(sr+1,sc,tr,tc,isVisited) +
        noOfPath(sr,sc+1,tr,tc,isVisited) +
        noOfPath(sr-1,sc,tr,tc,isVisited) +
        noOfPath(sr,sc-1,tr,tc,isVisited);

        isVisited[sr][sc]=false;   //backtrack

        return count;
    }

    //**************************************printPaths*****************************************************************//
    public void printPath(int sr,int sc,int tr,int tc,String s,boolean[][] isVisited){
        int rows = isVisited.length, cols = isVisited[0].length;
        if(sc<0 || sr<0 || sr>=rows || sc>=cols) return;
        if(isVisited[sr][sc]) return;
        if(sr==tr && sc==tc) {
            System.out.println(s);
            return;
        }

        isVisited[sr][sc]=true;

        printPath(sr+1, sc, tr, tc, s+"D", isVisited);
        printPath(sr, sc+1, tr, tc, s+"R", isVisited);
        printPath(sr-1, sc, tr, tc, s+"U", isVisited);
        printPath(sr, sc-1, tr, tc, s+"L", isVisited);

        isVisited[sr][sc]=false;
    }


}

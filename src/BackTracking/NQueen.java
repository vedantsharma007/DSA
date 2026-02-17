package BackTracking;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

//leetcode 51

public class NQueen {

    //********************************* main logic function *********************************************

    public void nQueen(List<List<String>> ans,char[][] board,int row){
        int n=board.length;
        if(row==n){
            ans.add(construct(board));
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(ans,board,row+1);
                board[row][j]='.';
            }
        }
    }
    //*************************************** function for checking position of queen is safe or not ***********

    public boolean isSafe(char[][] board,int row,int col){
        int n=board.length;
        //column check
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        //diagonal check
        int i=row-1,j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        //anti-diagonal check
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
    //********************************* function for converting board into string list ****************

    private List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
    //*********************************** main function *********************************************

    public static void  main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        List<List<String>> ans=new ArrayList<>();

        NQueen obj=new NQueen();

        obj.nQueen(ans,board,0);

        System.out.println("possible positions of queen are: ");
        for(List list: ans){
            System.out.println(list);
        }
    }
}

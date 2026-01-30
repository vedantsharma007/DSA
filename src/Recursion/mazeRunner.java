package Recursion;



public class mazeRunner {

    //*****************************************noOfPaths**************************************************************//
    public int noOfPaths(int sr,int sc,int tr,int tc){
        if(sr>tr || sc>tc || sc<1 || sr<1) return 0;
        if(sr==tr && sc==tc) {
            return 1;
        }
        return noOfPaths(sr+1,sc,tr,tc) + noOfPaths(sr,sc+1,tr,tc) ;
    }

    //**************************************printPaths*****************************************************************//
    public String printPath(int sr,int sc,int tr,int tc,String s){
        if(sr>tr || sc>tc) return null;
        if(sr==tr && sc==tc) {
            System.out.println(s);
        }
        return printPath(sr+1,sc,tr,tc,s+"R") + printPath(sr,sc+1,tr,tc,s+"D");
    }

    //************************************mainFunction***************************************************************//
    public static void main(String[] args){
        int sr=1,sc=1; //start row and start column
        int tr=2,tc=3; //target row and target column
        String s="";
        mazeRunner obj=new mazeRunner();
        int count= obj.noOfPaths(sr,sc,tr,tc);

        mazeRunner obj1=new mazeRunner();
        String paths= obj1.printPath(sr,sc,tr,tc,s);

        System.out.println("no of ways to reach target is: "+count);
    }

    //for allowing four directions you have to make a matrix for visited nodes
    //if you dont stackoverflow condition will occur (right to left ,left to right -stays in loop)
}

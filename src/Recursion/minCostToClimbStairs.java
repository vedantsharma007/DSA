package Recursion;

public class minCostToClimbStairs {
    // simple recursive approach

    public int minCostClimbingStairs(int[] cost) {
        int c=0,i=0;
        return Math.min(minCost(cost,0,c),minCost(cost,1,c));
    }
    public int minCost(int[] cost,int i,int c){
        if(i>cost.length-1) return c;
        c+=cost[i];
        return Math.min(minCost(cost,i+1,c),minCost(cost,i+2,c));
    }
    public static void main(String[] args){
        int[] cost={1,100,1,1,1,100,1,1,100,1};

        minCostToClimbStairs obj=new minCostToClimbStairs();
        int ans= obj.minCostClimbingStairs(cost);
        System.out.print("Minimum cost required to reach top: "+ans);
    }
}

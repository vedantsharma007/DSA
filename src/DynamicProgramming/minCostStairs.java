package DynamicProgramming;
import java.util.Arrays;
import Recursion.minCostToClimbStairs;

public class minCostStairs {
    public int minCostClimbingStairs(int[] cost) {
        int i=0;
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
    }
    public int minCost(int[] cost,int i,int[] dp){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i]=cost[i]+Math.min(minCost(cost,i+1,dp),minCost(cost,i+2,dp));
        return dp[i];
    }
    public static void main(String[] args){
        int[] cost={1,100,1,1,1,100,1,1,100,1};

        minCostToClimbStairs obj=new minCostToClimbStairs();
        int ans= obj.minCostClimbingStairs(cost);
        System.out.print("Minimum cost required to reach top: "+ans);
    }
}

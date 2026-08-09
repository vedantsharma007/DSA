package DynamicProgramming;

public class HouseRobber {

    //approach 1 : Recursion
    public int rob(int[] nums) {
        return solve(nums,0);
    }

    //recursion
    private int solve(int[] nums,int i){
        if(i>= nums.length) return 0;
        int rob=nums[i]+solve(nums,i+2);
        int skip=solve(nums,i+1);
        return Math.max(rob,skip);
    }
    //***********************************************************************************************************************
    // approach 2 : recursion + memoization
    public int rob2(int[] nums,int[] dp,int i){
        if(i>=nums.length) return 0;
        return dp[i]=Math.max(nums[i]+rob2(nums,dp,i+2),rob2(nums,dp,i+1));
    }

    //***********************************************************************************************************************

    //approach 3 : tabulation (bottom up )
    public int rob3(int[] nums){
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    //***********************************************************************************************************************


    public static void main(String[] args){
        int[] nums={1,4,3,7,9};
        HouseRobber obj=new HouseRobber();
        int robbed=obj.rob(nums);
        System.out.println("maximum money can be robbed using rec: "+robbed);

        //rec + mem
        int[] dp=new int[nums.length];
        HouseRobber obj2=new HouseRobber();
        int robbed2=obj2.rob2(nums,dp,0);
        System.out.println("maximum money can be robbed using rec + mem: "+robbed2);

        //tabulation
        HouseRobber obj3=new HouseRobber();
        int robbed3=obj3.rob3(nums);
        System.out.println("maximum money can be robbed using tab: "+robbed3);
    }
}

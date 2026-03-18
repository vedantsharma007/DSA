package Arrays;

public class KadaneAlgo {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int best=nums[0];
        int start =0,end=0;
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            best=Math.max(best,curr);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums={5,-2,5};
        KadaneAlgo obj=new KadaneAlgo();
        int ans= obj.maxSubArray(nums);
        System.out.print("answer is: "+ans);
    }
}

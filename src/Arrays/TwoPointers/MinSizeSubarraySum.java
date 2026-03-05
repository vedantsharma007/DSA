package Arrays.TwoPointers;

public class MinSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0,min=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                min=Math.min(j-i+1,min);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums={2,3,1,2,4,3};

        MinSizeSubarraySum obj=new MinSizeSubarraySum();
        int ans=obj.minSubArrayLen(target,nums);
        System.out.print("min size subarray length is: "+ans);
    }
}

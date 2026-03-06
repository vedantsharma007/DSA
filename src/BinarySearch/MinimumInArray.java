package BinarySearch;

//LC 153 Find min in rotated sorted array

import Arrays.TwoPointers.MinSizeSubarraySum;

public class MinimumInArray {
    public int minRotated(int[] nums){
        int s=0,e=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]<min){
                min=nums[m];
            }
            if(nums[m]>nums[e]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        MinimumInArray obj= new MinimumInArray();

        int ans= obj.minRotated(nums);
        System.out.println("Min element is: "+ans);
    }
}

//can also be solved without creating min variable
package Maths;

//Products of Array Except Self
//Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
//Each product is guaranteed to fit in a 32-bit integer.

//leetcode 238

import java.util.Arrays;

public class MultiplyExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int mul=1,zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                mul=mul*nums[i];
            }
            else{
                zero++;
            }
        }
        if(zero>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
        }
        if(zero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i]=0;
                }
                else{
                    nums[i]=mul;
                }
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=mul/nums[i];
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums= {1, 12, 7, 3, 0, 4};
        int[] nums1= {1, 12, 7, 3, -1, 4};
        MultiplyExceptItself obj=new MultiplyExceptItself();
        int[] ans= obj.productExceptSelf(nums);
        System.out.println("answer is : "+ Arrays.toString(ans));
        int[] ans2= obj.productExceptSelf(nums1);
        System.out.println("answer is : "+ Arrays.toString(ans2));
    }
}

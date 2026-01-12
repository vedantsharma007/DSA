package Hashing;
//Given an integer array nums, return
// true if any value appears more than once
// in the array, otherwise return false.

//should aim for a solution with O(n) time and O(n) space,
// where n is the size of the input array.


//O(n) time and O(n) space complexity gives hint for hashing
//that means in array questions where required time complexity is O(n)
//use hashing

import java.util.HashSet;
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums1={1,3,4,632,43,656,1,1,514,5654,67,564,3,4,234465,647,32};
        int[] nums2={1,3,4,632,43,656,17,11,514,5654,67,564,33,44,234465,647,32};
        System.out.println(containsDuplicate(nums1));
        System.out.print(containsDuplicate(nums2));

//        in oops it can be written as
//        // 1. Pehle class ka object banaya
//        Hashing.containsDuplicate obj = new Hashing.containsDuplicate();
//
//        // 2. Ab object ka use karke method call kra
//        boolean result = obj.checkDuplicate(nums);
//        fir print
    }
}

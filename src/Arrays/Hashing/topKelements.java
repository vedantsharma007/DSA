package Hashing;

//leetcode 347 and neetcode 5 (blind 75)
//req complexity is O(n)
//so just apply hashing


import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


public class topKelements {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> map=new HashMap<>();
            int[] ans=new int[k];
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            for(int i=0;i<k;i++){
                ans[i]= Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
                map.remove(ans[i]);
            }
            return ans;
        }
        public static void main(String[] args){
            int[] nums= {1, 12, 334, 32, 1, 4, 54, 7, 8, 5, 45, 3, 2, 3, 1, 23, 34, 5, 6, 6, 5, 34, 12, 32};
            int k=4;
            topKelements obj=new topKelements();
            int[] ans= obj.topKFrequent(nums,k);
            System.out.println("answer is : "+Arrays.toString(ans));
        }
}

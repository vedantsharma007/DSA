package Hashing;

//brute force -O(n^2) checking every pair is it equal to target or not
//next approach can be of sorting ,first sort then two pointers O(nlogn)
//again its an array question and req O(n) then do hashing

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class twoSum {
    public int[] indices(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                ans[0]=map.get(diff);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={87,2,65,24,562,3445,42,14,63,123,436,54,32,43};
        int target=150;
        twoSum obj=new twoSum();
        int[] ans= obj.indices(nums,target);
        System.out.println("answer is:"+ Arrays.toString(ans));
    }
}

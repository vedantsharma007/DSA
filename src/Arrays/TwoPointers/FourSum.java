package Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        if (nums == null || nums.length < 4) return list;
        Arrays.sort(nums);
        for(int x=0;x<nums.length-3;x++){
            if(x>0 && nums[x]==nums[x-1]){
                continue;
            }
            for(int i=x+1;i<nums.length-2;i++){
                if(i>x+1 && nums[i]==nums[i-1]){
                    continue;
                }
                int j=i+1;
                int k=nums.length-1;

                while(j<k){
                    long sum=(long)nums[x] + nums[i] + nums[j] + nums[k];
                    if (sum==target){
                        List<Integer> inner=new ArrayList<>();
                        list.add(Arrays.asList(nums[x],nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]) j++;
                        while(j<k && nums[k+1]==nums[k]) k--;
                    }
                    else if(sum>target) k--;
                    else j++;
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums= {1, -12, 32,- 1, 4, 0, 7, -8, 5, -45, 3, 2, 3, 1};
        int target=25;
        FourSum obj= new FourSum();
        List<List<Integer>> ans= obj.fourSum(nums,target);
        System.out.println("answer is : "+ ans);
    }
}

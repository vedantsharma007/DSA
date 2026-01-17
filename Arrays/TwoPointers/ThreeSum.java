package TwoPointers;

//brute force- search for every possible triplets through 3 loops(one inside other)
// complexity will be O(n^3)
//but required complexity is O(n^2)
//since we have to sort array (nlogn) and fixed target with more than one value given
//so use two pointers approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list1=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2){
            if(i>0 && nums[i]==nums[i-1]) {
                i++;
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                List<Integer> list2=new ArrayList<>();
                if(nums[i]+nums[j]+nums[k]==0){
                    list2.add(nums[i]);
                    list2.add(nums[j]);
                    list2.add(nums[k]);
                    list1.add(list2);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        return list1;
    }
    public static void main(String[] args){
        int[] nums= {1, -12, 32,- 1, 4, 0, 7, -8, 5, -45, 3, 2, 3, 1};
        ThreeSum obj=new ThreeSum();
        List<List<Integer>> ans= obj.threeSum(nums);
        System.out.println("answer is : "+ ans);
    }
}

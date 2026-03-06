package BinarySearch;

//LC 33 Search in Rotated Sorted Array

import Arrays.PrefixSum.FindPivotIndex;

public class SearchInRotatedArray {
    public int searchSorted(int[] nums,int target){
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[s]<=nums[m]){
                if(nums[m]>target && nums[s]<target){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{
                if(nums[m]>target && nums[e]>target){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=3;
        SearchInRotatedArray obj= new SearchInRotatedArray();

        int ans= obj.searchSorted(nums,target);
        System.out.println("element is at index: "+ans);
    }
}

// just normal binary search question the only thing you need to keep in mind is that you have to find one half which is sorted
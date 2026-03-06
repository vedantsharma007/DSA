package BinarySearch;

//LC 540 Single Element In Sorted Array

public class SingleElementInArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];

        int s=2,e=nums.length-3;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m%2==0 && nums[m]!=nums[m-1] && nums[m]!=nums[m+1]) return nums[m];
            else if((m%2==0 && nums[m]!=nums[m+1]) || (m%2==1 && nums[m]==nums[m+1])){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={4,4,5,5,3,6,6,7,7,9,9,10,10,12,12};
        SingleElementInArray obj= new SingleElementInArray();

        int ans= obj.singleNonDuplicate(nums);
        System.out.println("single element is: "+ans);
    }
}
//after taking unsorted array i realize it works well on unsorted also
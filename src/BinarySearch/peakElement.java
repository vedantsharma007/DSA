package BinarySearch;

public class peakElement {
    public int findPeakElement(int[] nums) {
        int s=0,e=nums.length-1;
        while(s<e){
            int m=(s+e)/2;
            if(nums[m]<nums[m+1]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return s;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,2,2,2,3,3,4,5,6};
        peakElement obj= new peakElement();
        int peak=obj.findPeakElement(nums);

        System.out.println("peak element is at: "+peak);
    }
}

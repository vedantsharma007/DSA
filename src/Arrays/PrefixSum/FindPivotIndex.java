package Arrays.PrefixSum;

//LC 724 -pivot index is the index from wher the left subarray sum equals to right subarray sum
//exactly same code for LC 1991 middle index of array

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;
        //System.out.print(prefix[0]+" ");
        for(int i=1;i<nums.length+1;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
            //System.out.print(prefix[i]+" ");
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]+prefix[i+1]==prefix[nums.length]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};

        FindPivotIndex obj=new FindPivotIndex();

        int ans= obj.pivotIndex(nums);
        System.out.println("pivot index is: "+ans);
    }
}

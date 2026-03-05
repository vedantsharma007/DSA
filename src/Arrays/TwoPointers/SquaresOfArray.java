package Arrays.TwoPointers;

//Squares of a Sorted Array LC 977

public class SquaresOfArray {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1,k=nums.length-1;
        int[] sq=new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
                sq[k--]=nums[i]*nums[i];
                i++;
            }
            else{
                sq[k--]=nums[j]*nums[j];
                j--;
            }
        }
        return sq;
    }

    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};

        SquaresOfArray obj=new SquaresOfArray();
        int[] ans= obj.sortedSquares(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

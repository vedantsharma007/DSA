package Arrays.TwoPointers;

public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]==0){
                j++;
            }
            else{
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes obj=new moveZeroes();
        obj.moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

package Arrays.TwoPointers;

public class SortColors {
    public void sort(int[] nums){
        int s=0,m=0,e=nums.length-1;
        while(m<=e){
            if(nums[m]==0){
                int temp=nums[s];
                nums[s]=0;
                nums[m]=temp;
                s++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int temp=nums[e];
                nums[e]=nums[m];
                nums[m]=temp;
                e--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        SortColors obj=new SortColors();

        obj.sort(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

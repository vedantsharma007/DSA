package Arrays.PrefixSum;

import java.util.Scanner;

public class RangeSumQuery {
    private int[] prefix;

    public void NumArray(int[] nums) {
        prefix = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = nums[i] + prefix[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right+1] - prefix[left];
    }

    public static void main(String[] args){

        System.out.println("enter length of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element of array: ");
            nums[i]=sc.nextInt();
        }

        RangeSumQuery obj=new RangeSumQuery();

        obj.NumArray(nums);
        int ans= obj.sumRange(0,2);
        System.out.println("sum from left to right is: "+ans);
    }
}

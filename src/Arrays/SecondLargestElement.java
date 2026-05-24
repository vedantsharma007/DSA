package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public int secLargest(int[] nums){
        int first=nums[0];
        int sec=-1;
        for(int i=0;i<nums.length;i++){
            if(first<nums[i]){
                sec = first;
                first=nums[i];
            }
            if(first> nums[i] && nums[i]>sec){
                sec=nums[i];
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            System.out.println("enter the "+ i + " element");
            nums[i]=sc.nextInt();
        }

        SecondLargestElement obj=new SecondLargestElement();
        System.out.print("Second Largest Element is: "+obj.secLargest(nums));
    }
}

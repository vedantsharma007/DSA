package Arrays.Subsets;

import java.util.ArrayList;
import java.util.List;

public class permutationIterative {
    public static void main(String[] args) {
        List<List<Integer>> outer=new ArrayList<>();
        int[] nums={1,2,3};
        int n=nums.length;
        while(n>1){
            n=n*(n-1);
        }
        permutationIterative obj=new permutationIterative();
        obj.per(nums,outer,n);
        for(List<Integer> list : outer){
            System.out.print(list+" ");
        }
    }
    public void per(int[] nums,List<List<Integer>> outer,int n){
        if(outer.size()==n) return;
        for(int i=0;i<nums.length;i++){
            List<Integer> inner=new ArrayList<>();
            inner.add(nums[i]);
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    inner.add(nums[j]);
                }
            }
            outer.add(inner);

        }

    }
}

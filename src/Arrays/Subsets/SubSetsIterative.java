package Arrays.Subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSetsIterative {
    public static void main(String[] args){
        int[] nums={1,2,3};

        SubSetsIterative obj=new SubSetsIterative();
        List<List<Integer>> ans=obj.subsets(nums);
        for(List<Integer> list:ans){
            System.out.print(list+" ");
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int size=outer.size();
            for(int j=0;j<size;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j));// have to copy each all existing subsets
                inner.add(nums[i]);                               //exixts=[] [1] then we have to copy then add nums[i]
                outer.add(inner);                                 //to it then adding this to outer list
            }
        }
        return outer;
    }
}

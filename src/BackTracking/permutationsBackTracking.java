package BackTracking;

import Arrays.Subsets.permutationIterative;

import java.util.ArrayList;
import java.util.List;

// first approach should be backtracking without any second thought because in
// this question we have to add something and remove it choose other

//time complexity with array list is O(n!) due to contains() method
//can be reduced by using array

public class permutationsBackTracking {
    //***************************************** logic ********************************************
    public void per(int[] nums,List<List<Integer>> ans,List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            per(nums,ans,list);
            list.remove(list.size()-1);
        }
    }
    //****************************************** main function *******************************************
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] nums={1,2,3};

        permutationsBackTracking obj=new permutationsBackTracking();
        obj.per(nums,ans,new ArrayList<>());

        for(List list:ans){
            System.out.println(list);
        }
    }
}

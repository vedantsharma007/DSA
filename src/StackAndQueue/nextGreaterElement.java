package StackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && num>st.peek()){
                map.put(st.pop(), num);
            }
            st.push(num);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        nextGreaterElement obj=new nextGreaterElement();
        int[] ans= obj.nextGreaterElement(nums1,nums2);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

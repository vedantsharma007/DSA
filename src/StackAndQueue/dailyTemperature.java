package StackAndQueue;

import java.util.Stack;

public class dailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int j=st.pop();
                ans[j]=i-j;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temp={73,74,75,71,69,72,76,80};

        dailyTemperature obj= new dailyTemperature();
        int[] ans= obj.dailyTemperatures(temp);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

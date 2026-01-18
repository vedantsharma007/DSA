package StackAndQueue;

//Easy question -you have to match brackets in O(n) time so use stack


import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else if(!st.isEmpty() && (st.peek()=='[' || st.peek()=='{')){
                    return false;
                }
                else{
                    st.push(ch);
                }
            }
            else if(ch==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                else if(!st.isEmpty() && (st.peek()=='(' || st.peek()=='{')){
                    return false;
                }
                else{
                    st.push(ch);
                }
            }
            else if(ch=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
                else if(!st.isEmpty() && (st.peek()=='[' || st.peek()=='(')){
                    return false;
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String s="({}[]())";
        ValidParentheses obj=new ValidParentheses();
        boolean ans= obj.isValid(s);
        System.out.println("parentheses are valid: "+ans);
    }
}

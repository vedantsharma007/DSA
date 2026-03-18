package StackAndQueue;

import java.util.Stack;

public class queueUsingStack {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void push(int x){
            s1.push(x);
        }

        int pop(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        int peek(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public static void main(String[] args){
            queueUsingStack q=new queueUsingStack();
            q.push(56);
            q.push(57);
            q.push(-1);
            System.out.println(q.pop());
            System.out.println(q.peek());
        }
}

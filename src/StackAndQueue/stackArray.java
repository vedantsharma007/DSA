package StackAndQueue;

public class stackArray {
    int[] st;
    int top;

    stackArray(int size){
        st=new int[size];
        top=-1;
    }

    public void push(int value){
        if(top==st.length-1){
            System.out.print("stack overflow");
            return ;
        }
        st[++top]=value;
    }

    public int pop(){
        if(top==-1){
            System.out.print("underlow");
            return -1;
        }
        return st[top--];
    }

    public int peek(){
        return st[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }


    public static void main(String[] args) {
        stackArray st=new stackArray(5);
        st.push(16);
        st.push(19);
        st.push(10);
        st.push(77);
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}

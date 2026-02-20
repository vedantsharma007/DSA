package Recursion;

public class TribonacciSeries {
    public int tribonacci(int n) {
        if(n<=0) return 0;
        if(n==1 || n==2) return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
    public static void main(String[] args){
        int n=4;

        TribonacciSeries obj=new TribonacciSeries();
        int ans= obj.tribonacci(n);
        System.out.print("answer is: "+ans);
    }
}

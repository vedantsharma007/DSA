package DynamicProgramming;

import Recursion.TribonacciSeries;

public class Tribonacci {
    //memorization
    /*
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int[] tri=new int[n+1];
        tri[0]=0;
        tri[1]=1;
        tri[2]=1;
        int sum=tri[0]+tri[1]+tri[2];
        for(int i=3;i<n+1;i++){
            tri[i]=sum;
            sum-=tri[i-3];
            sum+=tri[i];
        }
        return tri[n];
    }
    */

    //tabulation
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int a=0,b=1,c=1;
        for(int i=3;i<n+1;i++){
            int temp=a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return c;
    }

    public static void main(String[] args){
        int n=4;

        Tribonacci obj=new Tribonacci();
        int ans= obj.tribonacci(n);
        System.out.print("answer is: "+ans);
    }
}

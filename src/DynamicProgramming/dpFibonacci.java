package DynamicProgramming;

//in this approach we just made an array for storing result of smaller problems so that same problem does not need
//to calculate again and again
//this also reduce the time complexity from O(2^n) recursive to O(n) linear time
// fibonacci is similar to the question climbStairs and also same as 2*n tile question

public class dpFibonacci {
    public int climbStairs(int n) {
        if(n==1 || n==0) return n;
        int[] arr=new int[n+1];
        arr[1]=1;
        arr[2]=2;
        int i=3;
        while(i<n+1){
            arr[i]=arr[i-1]+arr[i-2];
            i++;
        }
        return arr[n];
    }
    public static void main(String[] args){
        int n=5;
        dpFibonacci obj=new dpFibonacci();
        int ans= obj.climbStairs(n);
        System.out.print("no.of ways to reach nth stair are: "+ans);
    }
}

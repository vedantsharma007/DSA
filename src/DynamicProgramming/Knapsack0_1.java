package DynamicProgramming;

public class Knapsack0_1 {

    public int profit(int i,int[] w,int[] p,int c){
        if(i==w.length) return 0;
        int skip=profit(i+1,w,p,c);
        if(w[i]>c) return skip;
        int pick=p[i]+profit(i+1,w,p,c-w[i]);
        return Math.max(skip,pick);
    }
    public static void main(String[] args){
        int[] w={4,5,8,2,13};
        int[] p={2,4,6,4,13};
        int c=14;
        Knapsack0_1 obj=new Knapsack0_1();
        int ans =obj.profit(0,w,p,c);
        System.out.println("maximum profit can be: "+ ans);
    }
}

package Graph;

// approach is similar to moore's voting algo for majority element
// subtracting 1 for 1st element of row and adding 1 for 2nd element
public class TownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] trustScore=new int[n+1];
        for(int[] t :trust){
            trustScore[t[0]]-=1;
            trustScore[t[1]]+=1;
        }
        for(int i=1;i<n+1;i++){
            if(trustScore[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] trust={{1,2},{2,3},{1,3}};
        int n=3;

        TownJudge obj= new TownJudge();
        int ans= obj.findJudge(n,trust);
        System.out.print("Judge of town is: " + ans);
    }
}

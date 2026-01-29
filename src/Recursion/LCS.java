package Recursion;


// reduce time complexity of lcs by using memorization(dp)

public class LCS {
    // O(n) space complexity
    //******************************************************************************************************************
    /*
    public int longestCommonSubsequence(String text1, String text2) {
        int i=0,j=0;
        char[] X=text1.toCharArray();
        char[] Y=text2.toCharArray();
        return lcs(X,i,Y,j);
    }
    public int lcs(char[] X,int i,char[] Y,int j){
        if(i==X.length || j==Y.length) return 0;
        if(X[i]==Y[j]){
            return 1+lcs(X,i+1,Y,j+1);
        }
        return Math.max(lcs(X,i,Y,j+1),lcs(X,i+1,Y,j));
    }*/
    //******************************************************************************************************************

    //second approach with O(1) space complexity
    //******************************************************************************************************************
    public int longestCommonSubsequence(String text1, String text2) {
        int i=0,j=0;
        return lcs(text1,i,text2,j);
    }
    public int lcs(String text1,int i, String text2,int j){
        if(i==text1.length() || j==text2.length()) return 0;
        if(text1.charAt(i)==text2.charAt(j)){
            return 1+lcs(text1,i+1,text2,j+1);
        }
        return Math.max(lcs(text1,i,text2,j+1),lcs(text1,i+1,text2,j));
    }
    //******************************************************************************************************************

    public static void main(String[] args){
        String text1="ABCDEFGHABIDH";
        String text2="ABJHVSHJVDHFH";

        LCS obj=new LCS();
        int ans= obj.longestCommonSubsequence(text1,text2);
        System.out.print("Length of Longest Common Subsequence is: "+ans);
    }
}

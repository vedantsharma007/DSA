package Arrays.strings;

public class windowSubstring {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0,right=0,start=0,count=t.length();
        int minLen=Integer.MAX_VALUE;
        while(right<s.length()){
            if(freq[s.charAt(right)]>0){
                count--;
            }
            freq[s.charAt(right)]--;
            right++;

            while(count==0){
                if(right-left<minLen){
                    minLen=right-left;
                    start=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s="ADOBECODEBANC", t = "ABC";
        windowSubstring obj=new windowSubstring();
        String ans= obj.minWindow(s,t);
        System.out.print("shortest string which contains all characters of t is: "+ans);
    }
}

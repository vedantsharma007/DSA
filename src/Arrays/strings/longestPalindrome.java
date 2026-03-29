package Arrays.strings;

public class longestPalindrome {
    public int longestPalindrome(String s) {
        int[] freq=new int[26];
        int[] freqB=new int[26];
        int longest=0,odd=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                freq[s.charAt(i)-'a']++;
            }
            else{
                freqB[s.charAt(i)-'A']++;
            }
        }
        boolean isOdd=false;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0){
                longest+=freq[i];
            }
            else{
                longest+=(freq[i]-1);
                isOdd=true;
            }
            if(freqB[i]%2==0){
                longest+=freqB[i];
            }
            else{
                longest+=(freqB[i]-1);
                isOdd=true;
            }
        }
        return isOdd?longest+1:longest;
    }
    public static void main(String[] args){
        String s= "racecar";
        longestPalindrome obj= new longestPalindrome();
        int ans= obj.longestPalindrome(s);
        System.out.println("String is palindrome? : "+ ans);
    }
}

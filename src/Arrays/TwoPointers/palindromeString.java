package TwoPointers;

//Approach remove all except numbers and letters
//then initialize two pointers one from starting one from end

//easy question just need to memorize String methods used to remove spaces and for replacing something
//.replaceAll("[^a-zA-Z0-9]","") and use same for removing spaces

//leetcode 125

public class palindromeString {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("\\s+", "").replaceAll("[^a-z0-9]", "");
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String s= "Was it a car or a cat I saw?";
        palindromeString obj= new palindromeString();
        boolean ans= obj.isPalindrome(s);
        System.out.println("String is palindrome? : "+ ans);
    }
}

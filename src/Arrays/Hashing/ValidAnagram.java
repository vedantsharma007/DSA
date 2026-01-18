package Hashing;

//Given two strings s and t, return true
// if the two strings are anagrams of each other, otherwise return false.
//An anagram is a string that contains the exact same
// characters as another string, but the order of the characters can be different.


//should aim for a solution with O(n + m) time and O(1) space,
// where n is the length of the string s and m is the length of the string t

// O(n+m)time  is possible with hashing
//again req O(n) time use hashing

import java.util.HashMap;
import java.util.Map;
public class ValidAnagram {
    private boolean valid(String s,String t){
        Map<Character,Integer> mp =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
            mp.put(ch2, mp.getOrDefault(ch2,0)-1);
        }
        for(int i:mp.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="racecar";
        String t="carrace";
        Hashing.ValidAnagram obj1=new Hashing.ValidAnagram();
        boolean result=obj1.valid(s,t);
        System.out.println(result);
    }
}

//leetcode 242
//can be solved in less time ..think about it

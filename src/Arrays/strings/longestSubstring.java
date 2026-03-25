package Arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,length=0;
        Map<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch,right);
            length=Math.max(length,right-left+1);
            right++;
        }
        return length;
    }

    public static void main(String[] args) {
        String s="racecar";
        longestSubstring obj1= new longestSubstring();
        int result=obj1.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

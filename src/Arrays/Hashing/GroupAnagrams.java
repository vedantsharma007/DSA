package Arrays.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams obj=new GroupAnagrams();
        List<List<String>> ans=obj.groupAnagrams(strs);
        System.out.print(ans);
    }
}

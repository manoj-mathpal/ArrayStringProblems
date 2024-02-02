package arrayStringProblems;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class LongestSubstring {

    public int findLongestSubstring(String str){
        int i = 0,j=0,max=0;
        HashSet<Character> set = new HashSet<>();
        while(j<str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                j++;
                max = Math.max(set.size(),max);
            }
            else{
                set.remove(str.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        TreeMap<Integer, List<String>> map= new TreeMap(Collections.reverseOrder());
map.firstKey();
        System.out.println(new LongestSubstring().findLongestSubstring("pwwkew"));
    }
}

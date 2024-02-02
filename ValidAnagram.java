package arrayStringProblems;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public boolean isValidAnagram(String s , String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();


        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();


        for(int i=0;i<ch1.length;i++){
            if(map1.containsKey(ch1[i])){
                map1.put(ch1[i],map1.get(ch1[i])+1);
            }
            else {
                map1.put(ch1[i], 1);
            }

            if(map2.containsKey(ch2[i])){
                map2.put(ch2[i],map2.get(ch2[i])+1);
            }
            else{
                map2.put(ch2[i],1);
            }

        }
        if(map1.equals(map2)){
            return true;
        }
       else{
           return false;
        }
    }



    public static void main(String[] args){
//        ValidAnagram obj = new ValidAnagram();
//        System.out.println(obj.isValidAnagram("ratmt","tarmt"));

    }
}

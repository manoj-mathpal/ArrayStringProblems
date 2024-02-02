package arrayStringProblems;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StringManupulation2 {

    public TreeMap<Integer,String> reverseStringSentence(String str){
        str = str.trim();
        int j=0;
        TreeMap<Integer,String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
        for (int i=0;i<str.toCharArray().length;i++){
            if(str.toCharArray()[i]==' '){
                map.put(weight(str.substring(j,i)),str.substring(j,i));
                j=i+1;
            }

        }
        map.put(weight(str.substring(j,str.toCharArray().length)),str.substring(j,str.toCharArray().length));
        return map;
    }
    public int weight(String str){
        int weight=0;
        char[] ch= str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                weight += ch[i] - 64;
            }
            if (ch[i] >= 97 && ch[i] <= 122) {
                weight += ch[i] - 96;
            }
        }
        return weight;
    }



    public static void main(String[] args) {
        StringManupulation2 obj = new StringManupulation2();
        TreeMap<Integer, String> map = obj.reverseStringSentence("Reverse This String");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print(" "+entry.getValue());
        }
    }

}

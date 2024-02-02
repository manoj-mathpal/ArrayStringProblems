package arrayStringProblems;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

    public void printOccurrence(String str){
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else {
                map.put(ch[i], 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        CharacterOccurrence obj = new CharacterOccurrence();
        obj.printOccurrence("guludu");
    }

}

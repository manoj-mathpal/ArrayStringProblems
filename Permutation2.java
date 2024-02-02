package arrayStringProblems;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {

    public List<List<Character>> permute(String str) {
        List<List<Character>> permutations = new ArrayList<>();
        backTrack(permutations,str.toCharArray(),0);
        return permutations;
    }

    public void backTrack(List<List<Character>> permutations, char[] ch, int start) {
        if(start==ch.length){
            permutations.add(toList(ch));
        }
        for (int i=start;i< ch.length;i++){
            swap(i,start,ch);
            backTrack(permutations,ch,start+1);
            swap(i,start,ch);
        }
    }

    private List<Character> toList(char[] ch) {
        List<Character> lst = new ArrayList<>();
        for (char i : ch)
            lst.add(i);
        return lst;
    }

    private void swap(int i, int j, char[] ch) {
        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }

    public static void main(String[] args) {
        List<List<Character>> permutations = new Permutation2().permute("abc");
        for (int i=0;i<permutations.size();i++){
            System.out.println(permutations.get(i));
        }
    }
}

package arrayStringProblems;

import java.util.Stack;

public class StringManupulation1 {

    public String reverseStringSentence(String str){
        str = str.trim();
        int j=0;
        String res ="";
        Stack<String> stk = new Stack<>();
        for (int i=0;i<str.toCharArray().length;i++){
            if(str.toCharArray()[i]==' '){
                 stk.push(str.substring(j,i));
                 j=i+1;
            }

        }
        stk.push(str.substring(j,str.toCharArray().length));
        while(!stk.isEmpty()) {
            res =res.concat(" " + stk.pop()).trim();
        }
        return res;
    }



    public static void main(String[] args) {
        StringManupulation1 obj = new StringManupulation1();
        String str = obj.reverseStringSentence("Reverse This String");
        System.out.println(str);
    }

}

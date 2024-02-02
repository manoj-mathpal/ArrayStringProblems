package arrayStringProblems;

public class Palindrome1 {

    public boolean isPalindrome(String str){
        int startPointer=0;
        int endPointer=str.length()-1;
        while(startPointer<=endPointer){
            if(str.charAt(startPointer)!=str.charAt(endPointer)){
                return helper(str,startPointer++,endPointer) || helper(str,startPointer,endPointer--);
            }
            startPointer++;
            endPointer--;
        }
        return true;
    }

    public boolean helper(String str,int i, int j){
        int startPointer=i;
        int endPointer=j;
        while(startPointer<=endPointer){
            if(str.charAt(startPointer)!=str.charAt(endPointer)){
                return false;
            }
            startPointer++;
            endPointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome1().isPalindrome("abca"));
    }
}

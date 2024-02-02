package arrayStringProblems;

public class Palindrome2 {

    public boolean convertString(String str){
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
        return isPalindrome(str);
    }


    public boolean isPalindrome(String str){
        int startPointer=0;
        int endPointer=str.length()-1;
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
        System.out.println(new Palindrome2().convertString("A man, a plan, a canal: Panama"));
    }
}

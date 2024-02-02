package arrayStringProblems;

public class LongestPalindrome1 {

    public int longestPalindrome(String str){
        int maxLength=0;
        int startPointer=0;
        int endPointer=str.length()-1;
        for(;startPointer<endPointer;){
            if(str.charAt(startPointer)!=str.charAt(endPointer)){
                startPointer++;
                endPointer--;
            }
            while(startPointer<endPointer && str.charAt(startPointer)==str.charAt(endPointer)){
                startPointer++;
                endPointer--;
                maxLength++;
            }
        }
        if(str.length()%2==0) {
            return maxLength * 2;
        }
        else{
            return (maxLength * 2) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome1().longestPalindrome("yzdbccccbdzx"));
    }

}

package arrayStringProblems;

public class LongestPalindromeSubString {

    public String findLongestPallindromeSubstring(String str){
        if(str==null || str.length()<1) return "";
        int start = 0;
        int end = 0;
        for(int i=0;i<str.length();i++){
            int len1 = partitionFromMiddle(str,i,i);
            int len2 = partitionFromMiddle(str,i,i+1);
            int len = Math.max(len1,len2);
            if (len>end-start){
                start= i- ((len-1)/2);
                end = i+ (len/2);
            }
        }
        return str.substring(start,end+1);
    }

    public int partitionFromMiddle(String str , int i , int j){
        if(str==null || i>j) {
            return 0;
        }
        while (i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSubString().findLongestPallindromeSubstring("babad"));
    }
}

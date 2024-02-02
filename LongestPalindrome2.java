package arrayStringProblems;

public class LongestPalindrome2 {

    public int findLongestLength(String str){
        int maxLength=0;
        int[] char_counts = new int[128];
        for(char c : str.toCharArray()){
            char_counts[c]++;
        }
        for(Integer char_count : char_counts) {
            if(char_count==0){
                continue;
            }
            maxLength += char_count/2 * 2;
            if(maxLength%2==0 && char_count%2==1){
                maxLength+=1;
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome2().findLongestLength("abccccdd"));
    }
}

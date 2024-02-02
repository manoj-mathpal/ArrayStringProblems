package arrayStringProblems;

public class CheckSubstring {

//    String s1 = “abcdxcde” j=0
//    String s2 = “cde” i=0



   // abcdxcde
   //  c d e


    public boolean isSubstring(String actual , String sub){
        int j=0;
       for(int i=0;i<sub.length();){
            if(sub.charAt(i)==actual.charAt(j)){
            i++;
            }
            else{
                i=0;
            }
            j++;
           if(i==sub.length()) return true;
       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println( new CheckSubstring().isSubstring("abcdxcde","cde"));
       ;
    }

}

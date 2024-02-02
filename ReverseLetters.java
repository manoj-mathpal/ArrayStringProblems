package arrayStringProblems;

public class ReverseLetters {
    public String reverseStringLetter(String str){
        char[] ch = str.toCharArray();
        int start=0,end=ch.length-1;
        while(start<end){
            if(ch[start]<65 || (ch[start]>=91&&ch[start]<=96)){
                start++;
                continue;
            }
            if(ch[end]<65 || (ch[start]>=91&&ch[start]<=96)){
                end--;
                continue;
            }
            else if (ch[end]>=65 && ch[end]>=65 ){
                swap(ch,start,end);
            }
            start++;
            end--;
        }
        return new String(ch);
    }

    private void swap(char[] ch, int start, int end) {
        char temp = ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseLetters().reverseStringLetter("ghzAb")); //"7_28]"
    }

}

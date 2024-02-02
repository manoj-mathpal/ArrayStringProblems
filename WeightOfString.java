package arrayStringProblems;

public class WeightOfString {

    public int weight(String str){
        int weight=0;
        char[] ch= str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                weight += ch[i] - 64;
            }
            if (ch[i] >= 97 && ch[i] <= 122) {
                weight += ch[i] - 96;
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        System.out.println(new WeightOfString().weight("Know Program"));
    }
}

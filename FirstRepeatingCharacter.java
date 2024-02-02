package arrayStringProblems;

public class FirstRepeatingCharacter {

    public Character findFirstRepeatingCharacter(String str){

        char[] ch = str.toCharArray();
        int i=0;
        int j=1;
        Character c = null;
        for(;i<=ch.length;){           //  john doee
            if(ch[i]==ch[j]){
                c=ch[j];
                break;
            }
            else{
                j++;
            }
            if(j==ch.length){
                i++;
                j=i+1;
            }
        }
        return c;
    }

    public static void main(String[] args) {

        String str = "john doee";
        FirstRepeatingCharacter obj = new FirstRepeatingCharacter();
        System.out.println(obj.findFirstRepeatingCharacter(str));
    }
}

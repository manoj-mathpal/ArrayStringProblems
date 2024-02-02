package arrayStringProblems;

import java.util.Stack;

public class ReverseInteger {

    public int reverseInt(int a){
        String str = String.valueOf(a);
        char[] ch = str.toCharArray();
        Stack<Character> stk=new Stack<>();
        String result="";
        for(int i=0;i<ch.length;i++){
                stk.push(ch[i]);
                if(stk.peek()=='-'){
                    result=result+stk.pop();
            }
        }
        while(!stk.isEmpty()){
            result = result + stk.pop();
        }
        Integer r=Integer.parseInt(result);
        return (result.equals("")) ? 0 : r;
    }

    public int reverseIntegerModulus(int x){
        String str="";
        int j=0;
        char[] ch = String.valueOf(x).toCharArray();
        StringBuilder obj = new StringBuilder(new String(ch)).reverse();

       // System.out.println(obj.toString());
return Integer.parseInt(obj.toString());

//        int[] nums = new int[String.valueOf(x).replaceAll("[$&+,:;=?@#|'<>.^*()%!-]","").length()];
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]=='-'){
//                str=str+ch[i];
//            }
//            else {
//                nums[j] = ch[i] - 48;
//                j++;
//            }
//        }
//        for(int i=nums.length-1;i>=0;i--){
//            if(nums[i]==0&&str.equals("")){
//                continue;
//            }
//            str=str+nums[i];
//        }
//        int fin;
//        try{
//            fin=Integer.valueOf(str);
//        }
//        catch (Exception e){
//            fin=0;
//        }
//        System.out.println("--------");
//
//        return (str.equals(""))?0:fin;
    }


    public static void main(String[] args) {

        System.out.println( new ReverseInteger().reverseIntegerModulus(123));

       // System.out.println( new Palindrome3().reverseInt(9646324351));
    }


}

//modulus approach ->
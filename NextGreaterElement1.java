package arrayStringProblems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] outputAry = new int[nums.length];
        Arrays.fill(outputAry,-1);
        for(int i=nums.length-1;i>=0;i--){
            if(!stack.isEmpty() && nums[i]<stack.peek()){
                outputAry[i]=stack.peek();
            }
            while(!stack.isEmpty() &&nums[i]>=stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty() && nums[i]<stack.peek()){
                outputAry[i]=stack.peek();
            }
            stack.push(nums[i]);
        }

        return outputAry;
    }

    public static void main(String[] args) {
        int [] ary1 = {4,12,5,3,1,2,5,3,1,2,4,6};
        int[] resultAry = new NextGreaterElement1().nextGreaterElement(ary1);
        for (int i=0;i<resultAry.length;i++){
            System.out.print(" " + resultAry[i]);
        }
    }
}

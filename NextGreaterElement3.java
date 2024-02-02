package arrayStringProblems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement3 {
    public int[] nextGreaterElement(int[] nums1) {
        Stack<Integer> stack = new Stack<>();
        int n = nums1.length;
        int[] outputAry = new int[n];
        Arrays.fill(outputAry,-1);
        for(int i=0;i<2*n-1;i++){
            while(!stack.isEmpty() && nums1[stack.peek()]<nums1[i%n]){
                outputAry[stack.pop()]=nums1[i%n];
            }
                if(i<n){
                stack.push(i);
                }
        }
        return outputAry;
    }

    public static void main(String[] args) {
        int [] ary1 = {1,2,1};
        int[] resultAry = new NextGreaterElement3().nextGreaterElement(ary1);
        for (int i=0;i<resultAry.length;i++){
            System.out.print(" " + resultAry[i]);
        }
    }
}

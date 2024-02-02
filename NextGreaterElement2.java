package arrayStringProblems;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement2 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i : nums2){
            while (!stack.isEmpty()&&stack.peek()<i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int [] ary1 = {4,1,2};
        int [] ary2 = {1,3,4,2};
        int[] resultAry = new NextGreaterElement2().nextGreaterElement(ary1,ary2);
        for (int i=0;i<resultAry.length;i++){
            System.out.print(" " + resultAry[i]);
        }
    }
}

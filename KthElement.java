package arrayStringProblems;

import java.util.PriorityQueue;

public class KthElement {

    public int findKthElement(int[] nums, int k){
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for(int x : nums){
            min_heap.add(x);
            if(min_heap.size()>k){
                min_heap.remove();
            }
        }
        return min_heap.remove();
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(new KthElement().findKthElement(arr,k));
    }
}

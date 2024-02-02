package arrayStringProblems;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backTrack(permutations,nums,0);
        return permutations;
    }

    public void backTrack(List<List<Integer>> permutations, int[] nums, int start) {
        if(start==nums.length){
            permutations.add(toList(nums));
        }
        for (int i=start;i< nums.length;i++){
            swap(i,start,nums);
            backTrack(permutations,nums,start+1);
            swap(i,start,nums);
        }
    }

    private List<Integer> toList(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i : nums)
            lst.add(i);
        return lst;
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> permutations = new Permutation1().permute(nums);
        for (int i=0;i<permutations.size();i++){
            System.out.println(permutations.get(i));
        }
    }

}

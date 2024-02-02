package arrayStringProblems;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int[] pair = new int[2];
        while (i < nums.length && j < nums.length) {
            if (nums[i] + nums[j] == target) {
                pair[0] = i;
                pair[1] = j;
                return pair;
            } else if (nums[i] + nums[j] != target) {
                j++;
                if (j == nums.length) {
                    i++;
                    j = i + 1;
                }
            }
        }
        return pair;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,4,7,1,1};
        int target = 2;
        int[]  indcies= new TwoSum().twoSum(arr,target);
        for (int i=0;i<indcies.length;i++){
            System.out.print(" " + indcies[i]);
        }
    }
}
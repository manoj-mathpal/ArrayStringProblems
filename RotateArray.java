package arrayStringProblems;

public class RotateArray {

    public int[] rotateArray(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        return reverse(nums,k,nums.length-1);

    }

    private int[]  reverse(int[] nums, int i, int j) {
       while(i<j){
           int temp = nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
           i++;
           j--;
       }

       return nums;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        RotateArray obj = new RotateArray();
        int[] rotatedAry = obj.rotateArray(num,3);
        for(int i=0;i<rotatedAry.length;i++){
            System.out.print(" " + rotatedAry[i]);
        }
    }

}

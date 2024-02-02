package arrayStringProblems;

public class HighestSecondHighestElement {

    public void findHighestSecondHighestElement(int[] nums){
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                continue;
            }
            if(second_max<max&&nums[i]>second_max){
                second_max=nums[i];
            }
        }

        System.out.println("highest = " + max);
        System.out.println("second highest = " + second_max);


/* With Sorting
        int [] sortedArray = sortArray(nums);
        System.out.println("Max element : " + sortedArray[sortedArray.length-1]);
        System.out.println("Second_Max element : " + sortedArray[sortedArray.length-2]);

        */


    }

    public int[] sortArray(int[] arr){
        int i=0;
        int j=1;
        for (;i<arr.length&&j<arr.length;) {
            if(arr[i]>arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(j== arr.length-1){
                i++;
                j=i+1;
            }
            else {
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int []  arr = {5,2,3,1};
        arr = new HighestSecondHighestElement().sortArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        //new HighestSecondHighestElement().findHighestSecondHighestElement(arr);
    }
}

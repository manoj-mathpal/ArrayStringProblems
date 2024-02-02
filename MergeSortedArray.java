package arrayStringProblems;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1=0,pointer2=0;
        while(pointer1<nums1.length){
            if(pointer1==nums1.length){

            }
            if(n==1&&pointer1==1) {
                for (int i : nums1) System.out.print(i);
                return;
            }
            if(nums1[pointer1]<nums2[pointer2]){
                    if(nums1[pointer1]==0&&nums2[pointer2]>=nums1[pointer1]){
                    nums1[pointer1]=nums2[pointer2];
                    pointer2++;
                }
                pointer1++;
            }
            else if(nums1[pointer1]==nums2[pointer2]){
                int temp = nums1[pointer1+1];
                nums1[pointer1+1]=nums2[pointer2];
                nums1[pointer1+1+1]=temp;
                pointer1++;
                pointer2++;
            }
            else{
                int temp = nums1[pointer1];
                nums1[pointer1]=nums2[pointer2];
                nums1[pointer1+1]=temp;
                pointer1++;
            }
        }
        for (int i : nums1) System.out.print(i);
    }

    public static void main(String[] args) {
        int[] nums1={2,0};
        int m=1;
        int[] nums2={1};
        int n=1;
        new MergeSortedArray().merge(nums1,m,nums2,n);
    }
}

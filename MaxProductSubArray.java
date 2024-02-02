package arrayStringProblems;

public class MaxProductSubArray {

    public int findMaxProduct(int[] nums){
        int maxProduct = Integer.MIN_VALUE,product=1;
        for(int i=0;i<nums.length;i++)
        {
            product *= nums[i];
            maxProduct = Math.max(product,maxProduct);
            if(product == 0 )  product=1;
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            product *= nums[i];
            maxProduct = Math.max(product,maxProduct);
            if(product == 0 )  product=1;
        }
        return maxProduct;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(new MaxProductSubArray().findMaxProduct(arr));
    }

}

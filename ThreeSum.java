package arrayStringProblems;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public List<Integer> threeSum(int[] nums) {
        int i = 0;
        int j = 1;
        int q = 2;
        List<Integer> lst = new ArrayList<>();
        while (i < nums.length && j < nums.length && q<nums.length) {
            if ((nums[i] + nums[j] + nums[q]) == 0 && j < nums.length && q<nums.length) {
                List<Integer> ele = new ArrayList<>();
                lst.add(nums[i]);
                lst.add(nums[j]);
                lst.add(nums[q]);
                j = j + 1;
                q=  j + 1;
            } else if ((nums[i] + nums[j] + nums[q]) != 0) {
                j++;
                q++;
                if (j == nums.length || q == nums.length) {
                    i++;
                    j = i + 1;
                    q=  j + 1;
                }
            }
        }
        return lst;
    }

    public List<List<Integer>> triSum(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length-1;j++){
                int k=j+1;
                if(arr[i]+arr[j]+arr[k]==0){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    list.add(al);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ThreeSum obj = new ThreeSum();
        List<List<Integer>> resultList =  obj.triSum(arr);
        for (int i=0;i<resultList.size();i++){
            System.out.println(resultList.get(i));
        }
    }
}

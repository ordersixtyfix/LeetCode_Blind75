package solutions_week2;

import static java.lang.Math.min;

public class q_153 {
    public static int findMin(int[] nums) {
        int result =nums[0];
        int left = 0;
        int right = nums.length -1;


        while(left<=right){
            if(nums[left]< nums[right]){
                result = min(nums[left],result);
                break;
            }
            int middle = (left+right)/2;
            result = min(result,nums[middle]);
            if(nums[middle]>=nums[left]){
                left = middle +1;
            }
            else{
                right = middle -1;
            }
        }



        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMin(nums);
        System.out.println("Minimum element: " + result);
    }
}

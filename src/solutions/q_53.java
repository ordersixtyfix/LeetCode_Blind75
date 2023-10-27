package solutions;


import static java.lang.Math.max;

public class q_53 {



    public  static int maxSubArray(int[] nums) {


        if(nums.length==0) return 0;

        int maxSub = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            maxSub = max(maxSub,curSum);

            if(curSum < 0 ) curSum =0 ;
        }

        return maxSub;


    }

    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[]{5,4,-10,7,8}));

    }


}

package solutions;
import java.util.Arrays;
import java.util.HashMap;

public class q_1 {


    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> compliments = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            if(compliments.containsKey(nums[i])){
                return new int[]{compliments.get(nums[i]),i};
            }
            compliments.put(target - nums[i],i);
        }

        return null;

    }

    public static void main(String[] args) {

        int arr[] = twoSum(new int[]{2,11,15,7},9);
        System.out.println(Arrays.toString(arr));
    }


}

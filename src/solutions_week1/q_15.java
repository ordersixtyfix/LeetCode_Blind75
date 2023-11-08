package solutions_week1;

import java.util.*;

public class q_15 {
    public static List<List<Integer>> threeSum(int[] nums) {


        HashSet<List<Integer>> hashSet = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++) {
            List<Integer> innerList = null;
            for (int j = i+1; j < nums.length; j++) {
                innerList = new ArrayList<>();
                int sum = nums[i] + nums[j];
                int index = Arrays.binarySearch(nums, -sum);
                if (index >= 0 && index != i && index != j && i!=j) {
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(nums[index]);
                    innerList.sort(Comparator.reverseOrder());
                    hashSet.add(innerList);
                }
            }
        }

        


        List<List<Integer>> integerList = new ArrayList<>(hashSet);

        return integerList;

    }



    public static void main(String[] args) {

        List<List<Integer>> list = threeSum((new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));

        System.out.println(list);




    }




}

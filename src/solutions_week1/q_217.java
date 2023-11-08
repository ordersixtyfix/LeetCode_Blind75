package solutions_week1;

import java.util.HashSet;

public class q_217 {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        boolean exist = containsDuplicate(new int[]{7,6,4,3,1});
        System.out.print(exist);
    }
}

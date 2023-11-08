package solutions_week2;

import java.util.HashSet;

import static java.lang.Math.min;

public class q_11 {

    public static int maxArea(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h1 = height[left];
            int h2 = height[right];
            int width = right - left;
            int area = width * min(h1, h2);
            max = Math.max(max, area);
            if (h1 < h2) {
                left++;
            } else {
                right--;
            }
        }

        return max;




    }


    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));



    }

}

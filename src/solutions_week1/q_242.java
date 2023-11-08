package solutions_week1;

import java.util.Arrays;

public class q_242 {


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

    }


    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        boolean exist = isAnagram(s,t);

        System.out.println(String.valueOf(exist));

    }

}

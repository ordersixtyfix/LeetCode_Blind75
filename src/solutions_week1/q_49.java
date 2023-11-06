package solutions;

import java.util.*;

public class q_49 {


    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> wordGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!wordGroups.containsKey(sortedStr)) {
                wordGroups.put(sortedStr, new ArrayList<>());
            }

            wordGroups.get(sortedStr).add(str);
        }

        return new ArrayList<>(wordGroups.values());

    }



    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

    }
}

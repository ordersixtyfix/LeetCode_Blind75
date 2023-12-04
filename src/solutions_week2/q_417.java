import java.util.ArrayList;
import java.util.List;

public class q_417 {

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        int len_col = heights[0].length;
        int len_row = heights.length;

        boolean[][] canReachPacific = new boolean[len_row][len_col];
        boolean[][] canReachAtlantic = new boolean[len_row][len_col];

        for (int i = 0; i < len_row; i++) {
            search(heights, canReachPacific, i, 0);
            search(heights, canReachAtlantic, i, len_col - 1);
        }

        for (int j = 0; j < len_col; j++) {
            search(heights, canReachPacific, 0, j);
            search(heights, canReachAtlantic, len_row - 1, j);
        }

        for (int i = 0; i < len_row; i++) {
            for (int j = 0; j < len_col; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    List<Integer> coordinates = new ArrayList<>();
                    coordinates.add(i);
                    coordinates.add(j);
                    result.add(coordinates);
                }
            }
        }

        return result;
    }

    public static void search(int[][] heights, boolean[][] canReach, int i, int j) {
        int len_row = heights.length;
        int len_col = heights[0].length;

        if (i < 0 || j < 0 || i >= len_row || j >= len_col || canReach[i][j]) {
            return;
        }

        canReach[i][j] = true;

        if (i - 1 >= 0 && heights[i][j] <= heights[i - 1][j]) {
            search(heights, canReach, i - 1, j);
        }

        if (i + 1 < len_row && heights[i][j] <= heights[i + 1][j]) {
            search(heights, canReach, i + 1, j);
        }

        if (j - 1 >= 0 && heights[i][j] <= heights[i][j - 1]) {
            search(heights, canReach, i, j - 1);
        }

        if (j + 1 < len_col && heights[i][j] <= heights[i][j + 1]) {
            search(heights, canReach, i, j + 1);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};

        List<List<Integer>> result = pacificAtlantic(arr);

        System.out.println(result);
    }
}

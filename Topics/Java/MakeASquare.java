public class MakeASquare {
    public static boolean valid(String[][] grid) {
        int n = grid.length;
        int i = 0;

        int possibleRow = 0;
        int possiblecol = 0;
        while (i < n) {
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                possibleRow++;
            }
            i++;
        }
        int j = 0;
        while (j < n) {
            if (grid[j][0] == grid[j][1] && grid[j][1] == grid[j][2]) {
                possiblecol++;
            }
            j++;
        }
        // if (possibleRow >= 2) {
        // return true;
        // } else {
        // return false;
        // }
        return possibleRow >= 2 || possiblecol >= 2;

    }

    public static void main(String[] args) {
        String[][] grid = { { "W", "W", "B" }, { "W", "W", "W" }, { "W", "W", "W" } };
        System.out.println(MakeASquare.valid(grid));
    }

}

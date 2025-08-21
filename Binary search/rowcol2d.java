public class rowcol2d {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[] result = search(matrix, 7);

        if (result[0] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found.");
        }
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1; // start from top-right

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // return index
            } else if (matrix[row][col] < target) {
                row++; // move down
            } else {
                col--; // move left
            }
        }
        return new int[]{-1, -1}; // not found
    }
}

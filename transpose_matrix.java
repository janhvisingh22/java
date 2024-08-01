import java.util.Arrays;
public class transpose_matrix 
{
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transpose = transposeMatrix(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose Matrix:");
        printMatrix(transpose);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix for the transpose
        int[][] transpose = new int[cols][rows];

        // Call the recursive function to compute the transpose
        return transposeRecursive(matrix, transpose, 0, 0);
    }

    public static int[][] transposeRecursive(int[][] matrix, int[][] transpose, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (row == rows) {
            return transpose; // Base case: All elements have been transposed
        }

        // Transpose the current element
        transpose[col][row] = matrix[row][col];

        // Move to the next element in the original matrix
        if (col == cols - 1) {
            // If we reached the last column, move to the next row
            return transposeRecursive(matrix, transpose, row + 1, 0);
        } else {
            // Otherwise, move to the next column in the same row
            return transposeRecursive(matrix, transpose, row, col + 1);
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
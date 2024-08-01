import java.util.Scanner;

public class MATRIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int n1 = sc.nextInt();
        int[][] matrix1 = new int[m1][n1];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of rows for the second matrix: ");
        int m2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int n2 = sc.nextInt();
        int[][] matrix2 = new int[m2][n2];

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
        } else {
            int[][] resultMatrix = multiplyMatrices(matrix1, matrix2, m1, n1, n2);

            System.out.println("Resulting matrix after multiplication:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int m, int n, int p) {
        int[][] resultMatrix = new int[m][p];
        return multiplyMatrices(matrix1, matrix2, resultMatrix, m, n, p, 0, 0, 0);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix, int m, int n, int p, int i, int j, int k) {
        if (i >= m) {
            return resultMatrix;
        } else if (j < p) {
            if (k < n) {
                resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                return multiplyMatrices(matrix1, matrix2, resultMatrix, m, n, p, i, j, k + 1);
            } else {
                return multiplyMatrices(matrix1, matrix2, resultMatrix, m, n, p, i, j + 1, 0);
            }
        } else {
            return multiplyMatrices(matrix1, matrix2, resultMatrix, m, n, p, i + 1, 0, 0);
        }
    }
}

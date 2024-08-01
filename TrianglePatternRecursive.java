public class TrianglePatternRecursive {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the triangle

        printTriangle(n, 1);
    }

    // Print a triangle pattern with increasing asterisks
    public static void printTriangle(int n, int row) {
        if (row > n) {
            return;
        }

        printStars(row); // Print stars for the current row

        System.out.println(); // Move to the next row

        printTriangle(n, row + 1); // Recursively print the next row
    }

    // Helper method to print stars
    public static void printStars(int count) {
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }
}

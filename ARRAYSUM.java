import java.util.Scanner;
public class ARRAYSUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int sum = calculateArraySum(array, 0, n - 1);
        System.out.println("The sum of elements in the array is: " + sum);

        input.close();
    }

    public static int calculateArraySum(int[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        } else {
            // Recursively calculate the sum of elements in the array
            return array[startIndex] + calculateArraySum(array, startIndex + 1, endIndex);
        }
    }
}
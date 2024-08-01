import java.util.Scanner;

public class ARRAY2SUM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the arrays: ");
        int n = input.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < n; i++) {
            array1[i] = input.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < n; i++) {
            array2[i] = input.nextInt();
        }

        int[] sumArray = new int[n];
        sumArrays(array1, array2, sumArray, n, 0);

        System.out.println("Sum of the two arrays is:");
        for (int i = 0; i < n; i++) {
            System.out.print(sumArray[i] + " ");
        }

        input.close();
    }

    public static void sumArrays(int[] array1, int[] array2, int[] sumArray, int n, int index) {
        if (index == n) {
            return; // Base case, we have processed all elements
        }

        sumArray[index] = array1[index] + array2[index]; // Calculate the sum

        // Recursively process the next element
        sumArrays(array1, array2, sumArray, n, index + 1);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class counting_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Result:");
        for (int num : arr) {
            int frequency = frequencyMap.get(num);
            if (frequency == 1) {
                System.out.println("1 for element"+num);
            } else {
                System.out.println("2 for element"+num);
            }
        }
    }
}
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Recursive binary search method
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Element is not in the array
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Element found at mid
        } else if (arr[mid] < target) {
            // Recur on the right half
            return binarySearch(arr, target, mid + 1, right);
        } else {
            // Recur on the left half
            return binarySearch(arr, target, left, mid - 1);
        }
    }
}

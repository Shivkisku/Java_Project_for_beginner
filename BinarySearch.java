import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Number " + target + " found at index " + index + " in the array.");
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}

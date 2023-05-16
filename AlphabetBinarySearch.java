import java.util.Arrays;
import java.util.Scanner;

public class AlphabetBinarySearch {
    public static int binarySearch(char[] array, char target) {
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

        return -1; // Target alphabet not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sorted array of alphabets (a-z): ");
        String input = scanner.nextLine().toLowerCase();
        char[] alphabetArray = input.toCharArray();
        Arrays.sort(alphabetArray);

        System.out.print("Enter the alphabet to search for: ");
        char target = scanner.nextLine().charAt(0);

        int index = binarySearch(alphabetArray, target);

        if (index != -1) {
            System.out.println("The alphabet '" + target + "' is found at index " + index + " in the array.");
        } else {
            System.out.println("The alphabet '" + target + "' is not found in the array.");
        }
    }
}

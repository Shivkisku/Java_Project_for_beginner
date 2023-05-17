import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] array1 = new int[384];
        int[] array2 = new int[384];
        
        // Initialize the arrays with some values (for demonstration purposes)
        Arrays.fill(array1, 1);
        Arrays.fill(array2, 2);
        
        int[] sumArray = new int[384];
        
        for (int i = 0; i < 384; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Sum Array: " + Arrays.toString(sumArray));
    }
}

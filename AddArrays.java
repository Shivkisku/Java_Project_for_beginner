import java.util.Arrays;

public class AddArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int[] sumArray = addArrays(array1, array2);
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Sum Array: " + Arrays.toString(sumArray));
    }
    
    public static int[] addArrays(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] sumArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        
        return sumArray;
    }
}

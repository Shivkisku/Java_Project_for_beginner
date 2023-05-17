import java.util.Scanner;

public class AlphabetPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String alphabet = scanner.nextLine().toUpperCase();
        
        int position = getPosition(alphabet);
        
        if (position != -1) {
            System.out.println("The position of " + alphabet + " in the alphabetical series is " + position);
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }
    }
    
    public static int getPosition(String alphabet) {
        if (alphabet.length() == 1 && Character.isLetter(alphabet.charAt(0))) {
            char ch = alphabet.charAt(0);
            return ch - 'A' + 1;
        } else {
            return -1;
        }
    }
}

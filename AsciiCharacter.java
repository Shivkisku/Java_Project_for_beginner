import java.util.Scanner;

public class AsciiCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (0-127): ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 127) {
            char asciiCharacter = (char) number;
            System.out.println("ASCII Character: " + asciiCharacter);
        } else {
            System.out.println("Invalid input. Please enter an integer between 0 and 127.");
        }
    }
}

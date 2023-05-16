import java.util.Scanner;

public class StringToBinary {
    public static String convertToBinary(String input) {
        StringBuilder binaryString = new StringBuilder();
        for (char c : input.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            while (binary.length() < 8) {
                binary = "0" + binary; // Pad with leading zeros if necessary
            }
            binaryString.append(binary);
        }
        return binaryString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (up to 500 characters): ");
        String input = scanner.nextLine();

        if (input.length() <= 500) {
            String binaryString = convertToBinary(input);
            System.out.println("Binary representation: " + binaryString);
        } else {
            System.out.println("Invalid input. The string should be up to 500 characters long.");
        }
    }
}

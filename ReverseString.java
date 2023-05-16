public class ReverseString {
    public static String reverseText(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            String reversedText = reverseText(input);
            System.out.println("Reversed Text: " + reversedText);
        } else {
            System.out.println("Please provide an input text.");
        }
    }
}

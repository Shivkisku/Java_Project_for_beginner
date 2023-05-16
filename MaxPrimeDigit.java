import java.util.Scanner;

public class MaxPrimeDigit {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int extractMaxPrimeDigit(int number) {
        int maxPrime = -1;
        while (number > 0) {
            int digit = number % 10;
            if (isPrime(digit) && digit > maxPrime) {
                maxPrime = digit;
            }
            number /= 10;
        }
        return maxPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int maxPrimeDigit = extractMaxPrimeDigit(number);
        System.out.println("Maximum prime digit: " + maxPrimeDigit);
    }
}

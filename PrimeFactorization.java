import java.util.Scanner;

public class PrimeFactorization {
    public static void printPrimeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Prime Factorization: ");
        printPrimeFactorization(number);
    }
}

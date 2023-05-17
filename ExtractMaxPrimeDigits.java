import java.util.Scanner;

public class ExtractMaxPrimeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int maxPrimeDigits = extractMaxPrimeDigits(number);
        
        if (maxPrimeDigits == 0) {
            System.out.println("No prime digits found.");
        } else {
            System.out.println("The maximum prime digits from the number are: " + maxPrimeDigits);
        }
    }
    
    public static int extractMaxPrimeDigits(int number) {
        int maxPrime = 0;
        
        while (number > 0) {
            int digit = number % 10;
            
            if (isPrime(digit) && digit > maxPrime) {
                maxPrime = digit;
            }
            
            number /= 10;
        }
        
        return maxPrime;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

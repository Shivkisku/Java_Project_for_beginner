public class PrimeFibonacci {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 10000;
        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println("Prime Fibonacci numbers within the range of 1 to " + limit + ":");
        while (c <= limit) {
            if (isPrime(c)) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println();
    }
}

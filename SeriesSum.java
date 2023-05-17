import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sum = calculateSeriesSum(N);

        System.out.println("The sum of the series is: " + sum);
    }

    public static int calculateSeriesSum(int N) {
        int sum = 0;
        int seriesSum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i; // Calculate the partial sum
            seriesSum += sum; // Accumulate the partial sums
        }

        return seriesSum;
    }
}

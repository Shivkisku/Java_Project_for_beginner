import java.util.Scanner;

public class TimeSum {
    public static class Time {
        int hours;
        int minutes;
        int seconds;
    }

    public static Time sumTimes(Time time1, Time time2) {
        Time sum = new Time();
        
        sum.seconds = (time1.seconds + time2.seconds) % 60;
        int carrySeconds = (time1.seconds + time2.seconds) / 60;

        sum.minutes = (time1.minutes + time2.minutes + carrySeconds) % 60;
        int carryMinutes = (time1.minutes + time2.minutes + carrySeconds) / 60;

        sum.hours = time1.hours + time2.hours + carryMinutes;

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for time 1
        System.out.println("Enter time 1:");
        Time time1 = new Time();
        System.out.print("Hours: ");
        time1.hours = scanner.nextInt();
        System.out.print("Minutes: ");
        time1.minutes = scanner.nextInt();
        System.out.print("Seconds: ");
        time1.seconds = scanner.nextInt();

        // Get input for time 2
        System.out.println("\nEnter time 2:");
        Time time2 = new Time();
        System.out.print("Hours: ");
        time2.hours = scanner.nextInt();
        System.out.print("Minutes: ");
        time2.minutes = scanner.nextInt();
        System.out.print("Seconds: ");
        time2.seconds = scanner.nextInt();

        // Calculate the sum of times
        Time sum = sumTimes(time1, time2);

        // Display the sum
        System.out.println("\nSum of times:");
        System.out.println("Hours: " + sum.hours);
        System.out.println("Minutes: " + sum.minutes);
        System.out.println("Seconds: " + sum.seconds);

        scanner.close();
    }
}

import java.util.Scanner;

public class AngleAddition {
    public static class Angle {
        int degrees;
        int minutes;
        int seconds;
    }

    public static Angle addAngles(Angle angle1, Angle angle2) {
        Angle sum = new Angle();

        sum.seconds = (angle1.seconds + angle2.seconds) % 60;
        int carrySeconds = (angle1.seconds + angle2.seconds) / 60;

        sum.minutes = (angle1.minutes + angle2.minutes + carrySeconds) % 60;
        int carryMinutes = (angle1.minutes + angle2.minutes + carrySeconds) / 60;

        sum.degrees = angle1.degrees + angle2.degrees + carryMinutes;

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for angle 1
        System.out.println("Enter angle 1:");
        Angle angle1 = new Angle();
        System.out.print("Degrees: ");
        angle1.degrees = scanner.nextInt();
        System.out.print("Minutes: ");
        angle1.minutes = scanner.nextInt();
        System.out.print("Seconds: ");
        angle1.seconds = scanner.nextInt();

        // Get input for angle 2
        System.out.println("\nEnter angle 2:");
        Angle angle2 = new Angle();
        System.out.print("Degrees: ");
        angle2.degrees = scanner.nextInt();
        System.out.print("Minutes: ");
        angle2.minutes = scanner.nextInt();
        System.out.print("Seconds: ");
        angle2.seconds = scanner.nextInt();

        // Calculate the sum of angles
        Angle sum = addAngles(angle1, angle2);

        // Display the sum
        System.out.println("\nSum of angles:");
        System.out.println("Degrees: " + sum.degrees);
        System.out.println("Minutes: " + sum.minutes);
        System.out.println("Seconds: " + sum.seconds);

        scanner.close();
    }
}

import java.util.Scanner;

public class LCMHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        NumberOperations numberOps = new NumberOperations();
        int lcm = numberOps.calculateLCM(num1, num2);
        int hcf = numberOps.calculateHCF(num1, num2);
        
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
}

class NumberOperations {
    public int calculateLCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        int lcm = max;
        
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0)
                break;
            lcm += max;
        }
        
        return lcm;
    }
    
    public int calculateHCF(int num1, int num2) {
        int hcf = 1;
        int min = Math.min(num1, num2);
        
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }
        
        return hcf;
    }
}

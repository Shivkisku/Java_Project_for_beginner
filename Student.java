import java.util.Scanner;

public class Student {
    private String name;
    private int marks;
    private char grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void computeGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayGrade() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating the student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Taking input for student1
        System.out.print("Enter name for student1: ");
        String name1 = scanner.nextLine();
        student1.setName(name1);
        System.out.print("Enter marks for student1: ");
        int marks1 = scanner.nextInt();
        student1.setMarks(marks1);
        scanner.nextLine(); // Clearing the input buffer

        // Taking input for student2
        System.out.print("Enter name for student2: ");
        String name2 = scanner.nextLine();
        student2.setName(name2);
        System.out.print("Enter marks for student2: ");
        int marks2 = scanner.nextInt();
        student2.setMarks(marks2);

        // Computing and displaying the grades
        student1.computeGrade();
        student1.displayGrade();
        student2.computeGrade();
        student2.displayGrade();
    }
}

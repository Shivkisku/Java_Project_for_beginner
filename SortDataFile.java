import java.io.*;
import java.util.*;

public class SortDataFile {
    public static class Student implements Comparable<Student> {
        private int rollNumber;
        private int totalMarks;

        public Student(int rollNumber, int totalMarks) {
            this.rollNumber = rollNumber;
            this.totalMarks = totalMarks;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public int getTotalMarks() {
            return totalMarks;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.totalMarks, other.totalMarks);
        }
    }

    public static void createDataFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int rollNumber = i + 1;
                int totalMarks = random.nextInt(101); // Generating random marks between 0 and 100
                writer.write(rollNumber + " " + totalMarks);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    int rollNumber = Integer.parseInt(parts[0]);
                    int totalMarks = Integer.parseInt(parts[1]);
                    students.add(new Student(rollNumber, totalMarks));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNumber() + ", Total Marks: " + student.getTotalMarks());
        }
    }

    public static void main(String[] args) {
        String filePath = "data.txt";
        createDataFile(filePath);
        System.out.println("Data file created: " + filePath);

        List<Student> students = readDataFile(filePath);
        Collections.sort(students); // Sorting the list in ascending order of marks

        System.out.println("Sorted List:");
        printStudents(students);
    }
}

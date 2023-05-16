import java.io.*;
import java.util.*;

public class ModifyDataFile {
    public static class Student {
        private int rollNumber;
        private String name;
        private int totalMarks;

        public Student(int rollNumber, String name, int totalMarks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.totalMarks = totalMarks;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public int getTotalMarks() {
            return totalMarks;
        }

        public void setTotalMarks(int totalMarks) {
            this.totalMarks = totalMarks;
        }

        @Override
        public String toString() {
            return rollNumber + " " + name + " " + totalMarks;
        }
    }

    public static List<Student> readDataFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    int rollNumber = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int totalMarks = Integer.parseInt(parts[2]);
                    students.add(new Student(rollNumber, name, totalMarks));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void writeDataFile(List<Student> students, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modifyRecord(List<Student> students, int rollNumber, int newTotalMarks) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.setTotalMarks(newTotalMarks);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "data.txt";
        List<Student> students = readDataFile(filePath);

        // Displaying the initial data
        System.out.println("Initial Data:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Modifying a record
        int rollNumberToModify = 2;
        int newTotalMarks = 95;
        modifyRecord(students, rollNumberToModify, newTotalMarks);

        // Writing the modified data back to the file
        writeDataFile(students, filePath);

        // Displaying the modified data
        System.out.println("\nModified Data:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

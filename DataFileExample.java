import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataFileExample {
    public static void createDataFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample data file.");
            writer.newLine();
            writer.write("End of file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "data.txt";
        createDataFile(filePath);
        System.out.println("Data file created: " + filePath);
        System.out.println("Reading data file:");
        readDataFile(filePath);
    }
}

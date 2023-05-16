import java.util.Scanner;

public class MatrixCellValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[rows][columns];

        // Input the matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Input the row and column indices
        System.out.print("Enter the row index (0 to " + (rows - 1) + "): ");
        int rowIndex = scanner.nextInt();
        System.out.print("Enter the column index (0 to " + (columns - 1) + "): ");
        int colIndex = scanner.nextInt();

        // Check if the indices are within the matrix bounds
        if (rowIndex >= 0 && rowIndex < rows && colIndex >= 0 && colIndex < columns) {
            // Retrieve the cell value
            int cellValue = matrix[rowIndex][colIndex];
            System.out.println("Cell value at row " + rowIndex + " and column " + colIndex + ": " + cellValue);
        } else {
            System.out.println("Invalid indices. Please enter valid row and column indices.");
        }
    }
}

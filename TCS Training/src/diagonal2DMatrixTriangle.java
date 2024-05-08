import java.util.Scanner;

public class diagonal2DMatrixTriangle {

    public static void diagonalPrint(int[][] matrix, int rows, int cols) {
        // Iterate over each diagonal
        for (int diagonal = 0; diagonal < rows + cols - 1; diagonal++) {
            // Determine starting row and column for the current diagonal
            int startRow = Math.min(diagonal, rows - 1);
            int startCol = Math.max(0, diagonal - rows + 1);

            // Print elements along the current diagonal
            while (startRow >= 0 && startCol < cols) {
                System.out.print(matrix[startRow][startCol] + " ");
                startRow--;
                startCol++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int cols = scanner.nextInt();
        System.out.println("Enter the elements:");

        int[][] matrix = new int[rows][cols];

        // Input elements into the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix in triangle form
        System.out.println("Output Triangle:");
        diagonalPrint(matrix, rows, cols);
    }
}

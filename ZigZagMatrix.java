/*
Zig-Zag matrix printing
 */
import java.util.Scanner;

public class ZigZagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take matrix size input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Take matrix elements input
        System.out.println("Enter matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        // Print matrix in zig-zag order
        System.out.println("Zig-Zag order:");
        for (int row = 0; row < rows; row++) {
            if (row % 2 == 0) {
                // Left to right
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // Right to left
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        sc.close();
    }
}


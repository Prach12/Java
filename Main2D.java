import java.util.Scanner;

class Main2D {
    static void printMajorDiagonals(int[][] matrix, int n) {
        // Print the major diagonal elements
        for (int ind = 0; ind < n; ind++) {
            System.out.print(matrix[ind][ind] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.print("Major diagonal: ");
        printMajorDiagonals(matrix, n);

        sc.close();
    }
}

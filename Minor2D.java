import java.util.Scanner;

class Minor2D {
    static void printMinorDiagonals(int[][] matrix, int n) {
        // Print the minor diagonal elements
        for (int ind = 0; ind < n; ind++) {
            System.out.print(matrix[ind][n - 1 - ind] + " ");
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

        System.out.print("Minor diagonal: ");
        printMinorDiagonals(matrix, n);

        sc.close();
    }
}
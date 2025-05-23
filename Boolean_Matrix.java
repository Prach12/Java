import java.util.Scanner;

class Boolean_Matrix {
    // Method to search for an element in the matrix
    public static boolean findElement(int[][] matrix, int key) {
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int nRows = ip.nextInt();
        int nCols = ip.nextInt();

        int[][] matrix = new int[nRows][nCols];

        // Reading matrix elements
        for (int row = 0; row < nRows; row++) {
            for (int col = 0; col < nCols; col++) {
                matrix[row][col] = ip.nextInt();
            }
        }

        // Reading the search key
        int searchKey = ip.nextInt();

        // Printing total rows and columns
        System.out.println("Total Rows: " + nRows);
        System.out.println("Total Columns: " + nCols);

        // Search for the element
        if (findElement(matrix, searchKey))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        ip.close();
    }
}

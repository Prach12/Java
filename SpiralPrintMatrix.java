/*
Spiral way to print Matrix elements
 */
import java.util.Scanner;

public class SpiralPrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(mat[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(mat[i][right] + " ");
            right--;
            if (top <= bottom)
                for (int i = right; i >= left; i--) System.out.print(mat[bottom][i] + " ");
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) System.out.print(mat[i][left] + " ");
            left++;
        }
        sc.close();
    }
}

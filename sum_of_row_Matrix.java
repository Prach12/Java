//sum of all the row of the matrix

import java.util.Scanner;
class sum_of_row_Matrix
{

    static void sumOfRow(int[][] matrix)
    {
        for(int row=0; row<matrix.length; row++)
        {
            int Rowsum = 0;
            for(int col=0; col<matrix[0].length; col++)
            {
                Rowsum += matrix[row][col];
            }
            System.out.println("Sum of Row " + (row + 1) +" is " +Rowsum);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noRow = sc.nextInt();
        int noCol = sc.nextInt();
        int[][] matrix = new int[noRow][noCol];

        for(int row=0; row < noRow; row++)
        {
            for(int col=0; col < noCol; col++)
            {
                matrix[row][col] = sc.nextInt();
            }
        }
        sumOfRow(matrix);

    }
}
import java.util.Scanner;
class sum_of_column_Matrix
{
    static void sumOfColumn(int[][] matrix)
    {
        for(int col = 0; col < matrix[0].length; col++)
        {
            int Colsum = 0;
            for(int row = 0; row < matrix.length; row++)
            {
                Colsum += matrix[row][col];
            }
            System.out.println("Sum of Column " + (col + 1) + " is " + Colsum);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noRow = sc.nextInt();
        int noCol = sc.nextInt();
        int[][] matrix = new int[noRow][noCol];

        for(int row = 0; row < noRow; row++)
        {
            for(int col = 0; col < noCol; col++)
            {
                matrix[row][col] = sc.nextInt();
            }
        }
        sumOfColumn(matrix);
    }
}

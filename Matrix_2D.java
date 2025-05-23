import java.util.Scanner;
class Matrix_2D
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int nRow = ip.nextInt();
        int nCol = ip.nextInt();
        int [][] arr = new int[nRow][nCol];

        System.out.println("Enter the Element for Matrix:");

        for (int Row = 0; Row < nRow; Row++)  // row indexing
        {
            for (int Col = 0; Col < nCol; Col++)  // column indexing
            {
                arr[Row][Col] = ip.nextInt();
                System.out.print(arr[Row][Col] + " ");
            }
            System.out.println("Your Matrix Are:");
        }
        ip.close();
    }
}
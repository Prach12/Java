/* Recursion 
Problem-1 Sum of N numbers
*/

import java.util.Scanner;
class sum_of_N_num
{
    static int sumOfN(int n)
    {
        if(n==1) 
            return 1;
        else
            return n+sumOfN(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = sumOfN(n);
        System.out.println("Result of N number = "+res);
    }
}
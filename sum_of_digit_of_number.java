/*
 Sum of digits of a number
*/
import java.util.Scanner;
class sum_of_digit_of_number
{
        static int fact(int n)
        {
            if(n==1)
                return 1;
            else
                return n * fact(n-1);
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = fact(n);
        System.out.println("Factorial of number = "+res);
    }
}
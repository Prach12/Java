/*
Write a code to check whether the number is power of 2 or not.
*/
import java.util.Scanner;
public class Powerof2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPowerOfTwo(n))
        System.out.println(n + " is a power of 2");
        else
        System.out.println(n + " is not a power of 2");
    }
        public static boolean isPowerOfTwo(int n)
        {
            if (n == 0)
            return false;
            return (n & (n - 1)) == 0;
        }
            
}
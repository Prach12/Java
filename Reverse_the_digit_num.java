/*
Reversse the digit of a number
 */
import java.util.Scanner;
class Reverse_the_digit_num
{
    static int rev=0;
    static int reverse_num(int n)
    {
        if(n==0) 
           return rev;
        else
        {
          rev=(rev*10)+(n%10);
          return reverse_num(n/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       int res =reverse_num(num);
       System.out.println("Reverse  of the number is: " +res);
    }
}
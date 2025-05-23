/*
Fibonacci Series Printing50
*/

import java.util.Scanner;
class Fibonacci_Series  
{
    static void fiboSeries(int n) {
        fiboSeries(n, 0, 1); // Start with 0 and 1
    }

    static void fiboSeries(int n, int first, int second)
    {
        if(n > 0)
        {
            System.out.print(first + " ");
            fiboSeries(n - 1, second, first + second);
        } 
    }

    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        fiboSeries(n);
        ip.close();
    }
}
/*Write a code to change nth bit to 1*/

import java.util.Scanner;
class nth_bit_1
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the position of the bit");
        int pos = sc.nextInt();
        int mask = 1 <<  (pos - 1);
        n = n | mask;
        System.out.println("Number after changing nth bit to 1: " + n);

    }
}

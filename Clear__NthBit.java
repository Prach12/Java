/* Write a code to clear Nth Bit to Zero*/

import java.util.Scanner;
public class Clear__NthBit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = 10; // example number
        int pos = 2; // example position
        
        int mask = 1 << (pos - 1);
        int result = num & ~mask;
       
        System.out.println("Number after clearing " + pos + "th bit: " + result);
        sc.close();
    }
}
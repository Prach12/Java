/* Write a code to toggle the nth bit of a  number */

import java.util.Scanner;

class Toggle_Nth_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the bit position to toggle (1-based): ");
        int i = sc.nextInt();

        // Toggle the ith bit (1-based index)
        int result = n ^ (1 << (i - 1));
        System.out.println("The number after toggling the " + i + "th bit is: " + result);

        sc.close();
    }
}
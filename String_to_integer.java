/* Write a program to convert a string to an integer.
   Input 1:
   3457 (string)
   Output 1:
   3457 (integer)
*/

import java.util.Scanner;

class String_to_integer {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a string: ");
        String str = ip.nextLine(); // Read the input string

        int sum = 0; // Initialize sum to store the integer value
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get each character in the string
            sum = (sum * 10) + (ch - '0'); // Convert the character to an integer
        }

        System.out.println("Converted integer: " + sum); // Print the result
        ip.close(); // Close the Scanner
    }
}
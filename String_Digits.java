/*
write a program to read a string and convert digits of a string into integer number.
sample input 1:
Hello123
sample output 1:
1 2 3
*/
import java.util.Scanner; // Import the Scanner class

class String_Digits {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a string: ");
        String str = ip.nextLine(); // Read the input string

        int sum = 0; // Initialize sum to store the integer value of digits
        for (int ind = 0; ind < str.length(); ind++) {
            char ch = str.charAt(ind); // Get each character in the string
            if (ch >= '0' && ch <= '9') { // Check if the character is a digit
                sum = (sum * 10) + (ch - '0'); // Convert the digit character to an integer
            }
        }

        System.out.println("Extracted number: " + sum); // Print the result
        ip.close(); // Close the Scanner
    }
}
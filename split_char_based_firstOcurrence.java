/*
 write a program to split the given input string based  on the first occurence of the given input character.
sample innput 1:
runner
n
sample output 2:
run
ner
*/
import java.util.Scanner;

class split_char_based_firstOcurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to split on: ");
        char split_char = sc.next().charAt(0);

        // Find the first occurrence of the split character
        int index = str.indexOf(split_char);

        if (index == -1) {
            // If the character is not found, print the original string
            System.out.println("Character not found in the string.");
        } else {
            // Split the string into two parts based on the first occurrence
            String part1 = str.substring(0, index);
            String part2 = str.substring(index + 1);

            // Print the results
            System.out.println(part1);
            System.out.println(part2);
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
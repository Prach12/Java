/*Write a program to count the smart characters(special characters) in the given string.consider all characters except alphabets and digits as smart characters.
sample Input 1:
gjjtd#@$%
sample out 1:
4
sample Input 2:
togy@#123
sample out 2:
2
*/
import java.util.Scanner;

class SmartCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        System.out.println("Number of smart characters: " + count);
    }
}
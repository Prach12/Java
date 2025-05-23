import java.util.Scanner;

class Reverse_AlphabetOnly {
    public static String reverseAlphabetOnly(String input) {
        char[] charArray = input.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isLetter(charArray[left])) {
                left++;
            } else if (!Character.isLetter(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseAlphabetOnly(input));

        scanner.close(); // Close the Scanner
    }
}
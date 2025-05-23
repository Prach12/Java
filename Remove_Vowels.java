/*
Write a program to remove the vowels from the string.
Sample Input 1:
Prachi
Sample Output 1:
Prch
*/

class Remove_Vowels {
    public static void main(String[] args) {
        String str = "Prachi"; // Input string
        String result = removeVowels(str); // Call the method to remove vowels
        System.out.println("String after removing vowels: " + result); // Print the result
    }

    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder(); // Use StringBuilder to build the result
        String vowels = "aeiouAEIOU"; // Define vowels (both uppercase and lowercase)
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get each character in the string
            if (vowels.indexOf(ch) == -1) { // Check if the character is not a vowel
                sb.append(ch); // Append non-vowel characters to the StringBuilder
            }
        }
        
        return sb.toString(); // Convert StringBuilder to String and return
    }
}
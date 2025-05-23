/*
 Write a program to accept a string and perform reverse only on alphabatic characters do in in place reverse  
 
 sample input 1 :
 &%^&&*&
 sample output 1:
 $%^&&*&
sample input 2:
12ab$%2
sample output 2:
*/

import java.util.Scanner;

class Reverse_Alphabet {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = ip.nextLine(); // Read the input string

        int left = 0;
        int right = str.length() - 1;

        // Convert the string to a character array
        char[] str_arr = str.toCharArray();

        // Reverse the character array
        while (left < right) {
            char temp = str_arr[left];
            str_arr[left] = str_arr[right];
            str_arr[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        String res = new String(str_arr);
        System.out.println("Reversed string: " + res);

        ip.close(); // Close the Scanner
    }
}

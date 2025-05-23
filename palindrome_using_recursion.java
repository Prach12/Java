/* Write a code to check whether any string is palindrome or not using recursion*/

/* Write a code to check whether any string is palindrome or not using recursion*/

import java.util.Scanner;
public class palindrome_using_recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        boolean result = ispalindrome(str, 0, str.length()-1);
        if(result)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
        sc.close();
    }

   
    public static boolean ispalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return ispalindrome(str, left + 1, right - 1);
    }
}
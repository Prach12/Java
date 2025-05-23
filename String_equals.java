/*
write a program to take two strings from the user as inputs and check if both are equal or  not
Input format:
Accept two srings as input

output format:
equaln"Equal" or "Not Equal"

Sample Input 1:
MY Slate
My Slate

Sample Output 1:
Equal
 */
  
import java.util.Scanner;
class string_equals
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.next();

        if(str1.equals(str2))
            System.out.println("Equals");
        else 
            System.out.println("Not Equals");
    }
}  
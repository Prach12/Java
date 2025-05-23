/*
 Stringbulider

 Two ways to create StringBuilder  String
    way 1:
          StringBuilder str=new StringBuilder();

    way 2:

       StringBuilder str=new 
    
 Input Format:
    Accept String as  an Input
 output Format:
    Print the Replaced  String
 */
import java.util.Scanner;
class Replace_Vowel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   //elephant

        StringBuilder res = new StringBuilder();   //empty suitable string is created

        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);      //ch=e 
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                res.append(' ');
            else
                res.append(ch);
        }
        System.out.println(res);   //printing mutable string
        System.out.println(res.toString());     //convert mutable to immutable and print
    }
}


import java.util.Scanner;

/*
print numbers from 1 to numbers
*/
class print_nums_from_1
{
    static void printNum(int n)
    {
        if(n>0) 
        {
            printNum(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printNum(num);
    }
}
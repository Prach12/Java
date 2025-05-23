/*
Given an array and two positions, do swap those elements at those  two postions. If the positions mention exceeds index limit, then print "valid".
IP: Accept the integers as input  in the following order:
Array_Size
Array_Element
Position_1 Position_2
*/
import java.util.Scanner;
class swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        if(pos1>=n || pos2>=n)
        {
            System.out.println("valid");
        }
        else
        {
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
            for(int i=0; i<n; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
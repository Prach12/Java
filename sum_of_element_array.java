/*
sum of an array element
 */

 import java.util.Scanner;
class sum_of_element_array   
{
    static int sumOfElement(int[] arr, int size)
    {
        if(size==1)
            return arr[0];
        
        else
            return arr[size-1] + sumOfElement(arr,size-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        int res = sumOfElement(arr,size);
        System.out.println("Sum of Array element is: "+res);
    }
}
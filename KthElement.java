/*
K-th largest /smallest element in array

procedure 1: (Descending Order)
    The index of kth largest element = k-1 (zero based indexing)
    The index of kth smallest element = n-k

procedure 2: (Ascending Order)
    The index of kth largest element = n-k 
    The index of kth smallest element = k-1 (zero based indexing)
*/

import java.util.Arrays;
import java.util.Scanner;
class K_Largest_Smallest_ArrayEle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();
        Arrays.sort(arr);  //array sorted in ascending order
        System.out.println(Arrays.toString(arr));
        System.out.println("K Largest Element = "+arr[size-k]);
        System.out.println("K Smallest Element = "+arr[k-1]);
    }

}
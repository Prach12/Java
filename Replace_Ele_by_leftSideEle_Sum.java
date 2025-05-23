
import java.util.Scanner;
class Replace_Ele_by_leftSideEle_Sum
{

    static void replaceSumleftEle(long[] arr, int size)
    {
        long sum=0;
        for(int ind=0; ind<size; ind++)
        {
            sum = sum + arr[ind];
            arr[ind] =  sum - arr[ind];
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for(int ind=0; ind < size; ind++)
            arr[ind] = sc.nextLong();

        replaceSumleftEle(arr,size);
        for(long val : arr)
            System.out.print(val+" ");
    }
}
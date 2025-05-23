import java.util.Scanner;
class HalfRotateArrayLeft

{

    static void reverse(long[] arr, int left, int right)
    {
        while(left<right)
        {
            long temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void HalfrotateLeft(long[] arr, int size, int k)
    {
        k=k%size;
        reverse(arr, size/2, size-1);
        reverse(arr, size/2, size-k);
        reverse(arr, size-k+1, size-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];

        for(int ind=0; ind<size; ind++)
            arr[ind] = sc.nextLong();

        int k = sc.nextInt();

        HalfrotateRight(arr, size, k);
        System.out.print("The half right rotated array is: ");

        for(long val : arr)
            System.out.print(val+" ");

    }
}
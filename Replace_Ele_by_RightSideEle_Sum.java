/* Array Operations 
Replace with sum of rightmside elements
a) Brute force time complexity is O(N^2)
sudo code: 
for(target=0;target<size;target++)
{
    sum=0;
    for(span=target+1; span<size; span++)
    {
        sum+=arr[span];
    }
    arr[target]=sum;
}
b) Optimised Method
sudo code: time complexity is O(N)
array data will be store in the Heap memory
*/
import java.util.Scanner;
class Replace_Ele_by_RightSideEle_Sum
{

    static void replaceSumRightEle(long[] arr, int size)
    {
        long sum=0;
        for(int ind=size-1; ind>=0; ind--)
        {
            sum = sum + arr[ind];
            arr[ind] = sum - arr[ind];
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for(int ind=0; ind < size; ind++)
            arr[ind] = sc.nextLong();

        replaceSumRightEle(arr,size);
        for(long val : arr)
            System.out.print(val);
    }
}
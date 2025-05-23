int arr[]={11,33,12,45,67};
index:2
val:25
 output
 arr={11,33,25,12,45,67};
// Java program to insert an element at a given indeS
public class InsertElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {11, 33, 12, 45, 67};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Enter the index to insert the element: ");
        int index = sc.nextInt();
        System.out.print("Enter the value to insert: ");
        int val = sc.nextInt();
        
        // Create a new array with size increased by 1
        int newArr[] = new int[arr.length + 1];
        
        // Copy elements from the original array to the new array
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = val;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        
        // Print the new array
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}
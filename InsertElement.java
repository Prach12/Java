import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {11, 33, 12, 45, 67};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Enter the index to insert the element: ");
        int index = sc.nextInt();
        System.out.print("Enter the value to insert: ");
        int val = sc.nextInt();

        // Validate the index
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index. Please enter an index between 0 and " + arr.length);
            return;
        }

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

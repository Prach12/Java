public class MiddleElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        if (checkAverage(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Method to check if the average of the array is equal to the middle element
    public static boolean checkAverage(int[] arr, int n) {
        // Calculate the sum of the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / n;

        // Find the middle element
        int middleElement = arr[n / 2];

        // Check if the average is equal to the middle element
        return average == middleElement;
    }
}
    
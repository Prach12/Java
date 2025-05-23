import java.util.Scanner;

class unique_array_ele {
    static void findUniqueElement(long[] arr, int size) {
        for (int target = 0; target < size; target++) {
            if (arr[target] == -1) // Skip already marked elements
                continue;

            int freq_count = 0; // Initialize frequency count
            for (int span = 0; span < size; span++) {
                if (arr[target] == arr[span]) {
                    freq_count++;
                    if (span != target) { // Mark duplicates as -1
                        arr[span] = -1;
                    }
                }
            }

            // Print the element if it is unique (frequency = 1)
            if (freq_count == 1) {
                System.out.print(arr[target] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
        }

        findUniqueElement(arr, size);
    }
}
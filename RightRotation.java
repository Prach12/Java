// Array Right Rotation
// a) Brute Force Approach


class RotateArrayRight {
    public static void main(String[] args) {
        int n = 5;
        int d = 2;
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + d) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}


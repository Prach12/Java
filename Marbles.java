class Marbles {
    public static void main(String[] args) { // Fixed "Main" to "main" (Java is case-sensitive)
        int arr[] = {10, 7, 15, 4, 20};
        for (int i = 0; i < arr.length; i++) { // Changed "Length" to "length"
            if (i % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
            System.out.println("Player " + (i + 1) + " has " + arr[i] + " marbles left.");
            if (arr[i] > 5) {
                System.out.println("Player " + (i + 1) + " Well played!");
            } else {
                System.out.println("Player " + (i + 1) + " eliminated!");
            }
        }
    }
}
        
    
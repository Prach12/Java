/*
write a program to accept a name and age of the given person and print them in the following format "Name:Age".
input format:
Accept a string and integer
Sample input 1:
Rohan  98
sample output 1:
Rohan:98
*/

import java.util.Scanner; // Import the Scanner class

class StringAndInteger {
    // The main method to execute the program   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        String name = sc.next(); // Read the name
        int age = sc.nextInt(); // Read the age
        System.out.println(name + ":" + age); // Print the output in the required format
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
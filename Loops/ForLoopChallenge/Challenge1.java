package Loops.ForLoopChallenge;

import java.util.Scanner;

// Declare a Variable N.
// Write a code using for loop to print all the prime numbers from 1 to N.

public class Challenge1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want to see prime numbers: ");

        int num = sc.nextInt();

        System.out.printf("Prime numbers till %d are: ", num);

        for (int i = 2; i <= num; i++) { // Start from 2 as 1 is not a prime number
            if (isPrime(i)) { // Check if the number is prime
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Only check up to sqrt(n) for efficiency
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
}

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Check if a specific number is prime
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Input: List all prime numbers up to a specified limit
        System.out.print("Enter a limit to list all prime numbers up to: ");
        int limit = scanner.nextInt();
        System.out.println("Prime numbers up to " + limit + ":");
        listPrimesUpTo(limit);

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, prime
    }

    // Method to list all prime numbers up to a limit
    public static void listPrimesUpTo(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after listing primes
    }
}

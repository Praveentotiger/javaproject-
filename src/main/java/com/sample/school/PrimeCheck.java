package com.sample.school;

import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2) return true;  // 2 is the only even prime number
        if (n % 2 == 0) return false; // eliminate even numbers

        // check from 3 to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}



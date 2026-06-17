package com.meetpatel.mathutils;

/**
 * MathUtils - A utility library for common math operations.
 * Author: Your Name
 * Version: 1.0
 */
public class MathUtils {

    /**
     * Returns the factorial of a non-negative integer.
     * Example: factorial(5) = 120
     *
     * @param n a non-negative integer
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Input must be non-negative.");
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Checks whether a number is prime.
     * Example: isPrime(7) = true
     *
     * @param n the integer to check
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Clamps a value between a minimum and maximum.
     * Example: clamp(15, 0, 10) = 10
     *
     * @param value the value to clamp
     * @param min   the minimum allowed value
     * @param max   the maximum allowed value
     * @return the clamped value
     */
    public static int clamp(int value, int min, int max) {
        if (min > max) throw new IllegalArgumentException("min must be <= max.");
        return Math.max(min, Math.min(max, value));
    }

    /**
     * Returns the greatest common divisor (GCD) of two integers.
     * Example: gcd(12, 8) = 4
     *
     * @param a first integer
     * @param b second integer
     * @return the GCD of a and b
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * Checks whether a number is even.
     *
     * @param n the integer to check
     * @return true if n is even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
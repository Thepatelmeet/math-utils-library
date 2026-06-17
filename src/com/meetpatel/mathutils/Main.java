package com.meetpatel.mathutils;


/**
 * Main class to demonstrate MathUtils functionality.
 */
public class Main {
    public static void main(String[] args) {

        // Test factorial
        System.out.println("factorial(5) = " + MathUtils.factorial(5));  // 120

        // Test isPrime
        System.out.println("isPrime(7) = " + MathUtils.isPrime(7));      // true
        System.out.println("isPrime(10) = " + MathUtils.isPrime(10));    // false

        // Test clamp
        System.out.println("clamp(15, 0, 10) = " + MathUtils.clamp(15, 0, 10)); // 10

        // Test gcd
        System.out.println("gcd(12, 8) = " + MathUtils.gcd(12, 8));     // 4

        // Test isEven
        System.out.println("isEven(4) = " + MathUtils.isEven(4));        // true
        System.out.println("isEven(7) = " + MathUtils.isEven(7));        // false
    }
}

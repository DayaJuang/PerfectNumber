package org.example;

public class Main {
    public static void main(String[] args) {
        boolean ans = isPerfectNumber(6);
        System.out.println(ans);
    }

    //A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    public static boolean isPerfectNumber(int n){
        // Check if n is greater or equal 1
        if(n < 1)
            return false;

        // Do the perfect number check
        // Create the sum variable of the divisor and the divisor itself
        int sum = 0;
        int divisor = 1;

        while (divisor < n){
            // Check if it proper divisor or not (not leaving any remainder)
            if(n % divisor == 0)
                sum += divisor; // sum all proper divisor
            divisor++;
        }

        // Check if the sum and n is same value
        return (sum == n);
    }
}
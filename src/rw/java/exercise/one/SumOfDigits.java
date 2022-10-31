package rw.java.exercise.one;

// "author" : "Dan Bellamy"

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //write a program that compute the sum of digits in a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("---PROGRAM SUM OF DIGITS---");
        System.out.println();
        System.out.print("Please enter a number to sum its digits: ");
        int number = scanner.nextInt();
        int num = number;
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println();
        System.out.println("The sum of digits of " + num + " is " + sum);
    }
}

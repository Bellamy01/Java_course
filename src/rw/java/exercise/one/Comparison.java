package rw.java.exercise.one;

// "author" : "Dan Bellamy"

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){

        //write a program that prompts a user to enter two numbers and are compared

        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter the first number: ");
            number1=scanner.nextInt();
        System.out.print("Enter the second number: ");
            number2 = scanner.nextInt();
        System.out.println();

        System.out.println("-----OUTPUT-----");
        System.out.println();

        if(number1 > number2){
            System.out.println(number1 + " is greater than "+ number2);
        } else if (number1 < number2){
            System.out.println(number1 + " is less than "+ number2);
        }else{
            System.out.println(number1 + " is equal to "+ number2);
        }
    }
}

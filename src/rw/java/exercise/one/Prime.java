package rw.java.exercise.one;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        //write a program to display the prime numbers from 1 to n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scanner.nextInt();
        int i = 0;
        System.out.println("Prime numbers less than "+n+": ");
        while(i < n){
            if(i%2 != 0){
                System.out.print(" "+i);
            }
            i++;
        }
    }
}

package rw.java.exercise.one;

import java.security.spec.ECField;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        //write a program that converts a string to integer and vice-versa
        String string;
        int type;
        int number;
        Scanner scanner= new Scanner(System.in);
        try{
        System.out.println("----TYPE CONVERSION----");
        System.out.print("Enter 1 for number or 2 for string: ");
        type = scanner.nextInt();
        System.out.println(type);
        switch (type){
            case 1:
                System.out.print("Enter your number: ");
                int num = scanner.nextInt();
                string = String.valueOf(num);
                System.out.println(num + " has changed to "+ string);
            break;
            case 2:
                System.out.print("Enter your string: ");
                string = scanner.nextLine();
                number = Integer.parseInt(string);
                System.out.println(string + " has changed to "+ number);
            break;
            default:
                //error
                System.out.println("Error: Wrong input type. Please enter either n or s!!");
        }
    }catch (Exception error){
    System.out.println(error.getMessage());
    }
    }
}

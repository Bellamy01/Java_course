package rw.java.courses;

import java.util.Scanner;

public class challenge1 {
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            float height  = input.nextFloat();
            float weight = input.nextFloat();
            String name = input.nextLine();
            System.out.println("------THE BMI OF A PERSON------");
            System.out.println("Enter your name: "+ name);
            System.out.println("Enter your height(m): " + height);
            System.out.println("Enter your weight(kg): " + weight);

            float BMI = weight / (height * height);

            System.out.print("-----RESULTS------");
            System.out.println("The BMI of "+ name + "is "+BMI+ "kg/m2");
        }
    }


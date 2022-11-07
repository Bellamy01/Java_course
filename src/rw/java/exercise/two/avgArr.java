package rw.java.exercise.two;

import java.util.Scanner;

public class avgArr {
    //write a java program to calculate the avg of 10 numbers
    public static void main(String[] args){
        int sum = 0;
        int[] arrNum= new int[5];
        int maxNum = arrNum.length;


        Scanner scanner= new Scanner(System.in);
        System.out.println("The SUM of FIVE INPUT Numbers");
        for(int i =1; i <= maxNum;i++){
            System.out.print("Enter number "+i+": ");
            int index = i-1;
            arrNum[index] = scanner.nextInt();
            sum += arrNum[index];
        }

         double avg = sum/maxNum;
        System.out.print("Numbers: ");
        for(int n : arrNum){
            System.out.print(n+ " ");
        }
        System.out.println();
        System.out.println("The sum of the numbers: "+ sum);
        System.out.println("The average of numbers: "+ avg);
    }
}

package rw.java.exercise.two;

import java.util.Arrays;
import java.util.Scanner;

public class insArr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //write a program that inserts an element in an array
        int[] arr = {23,5,424,62,6,757,5,25};
        int arrLen = arr.length;
        System.out.println("INSERT AN ELEMENT IN AN ARRAY");
        System.out.println("ORIGINAL Array: "+Arrays.toString(arr));
        System.out.print("Enter element index to insert in: ");
        int index= scanner.nextInt();
        System.out.print("Enter new value at index "+ index+": ");
        int newVal = scanner.nextInt();
        for(int i = arrLen-1;i > index;i--){
            arr[i]= arr[i-1];
        }
        arr[index] = newVal;
        System.out.println("UPDATED Array: "+ Arrays.toString(arr));
    }
}

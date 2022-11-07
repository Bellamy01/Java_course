package rw.java.exercise.two;

import java.util.Scanner;

public class remArr {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //write a program to remove an element from an array
        int[] arr = {23,53,7,5,97,8,36,22,476,686,7,46,3,35,42};
        int arrLen = arr.length;
        System.out.println("REMOVE ELEMENT FROM ARRAY");
        System.out.print("Array: ");
        for(int i :arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("Select an element index to remove: ");
        int rem = scanner.nextInt();
        for(int i = rem;i < arrLen-1;i++){
            arr[i] = arr[i+1];
        }
        System.out.print("New Array: ");
        for(int i :arr){
            System.out.print(i+ " ");
        }
    }
}

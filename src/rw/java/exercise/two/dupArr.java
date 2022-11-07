package rw.java.exercise.two;

import java.util.Arrays;

public class dupArr {
    public static void main(String[] args){
        //write a program to find the duplicate values of an array
        int[] arr = new int[]{25,1,25,21,25,45,2,45};
        int arrLen = arr.length;
        System.out.println("DUPLICATE VALUE OF AN ARRAY");
        System.out.println("Array: "+ Arrays.toString(arr));

        System.out.print("Duplicate values: ");
        for(int i= 0; i < arrLen;i++){
            for(int j = i+1;j<arrLen;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}

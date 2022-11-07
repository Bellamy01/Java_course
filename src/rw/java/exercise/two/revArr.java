package rw.java.exercise.two;

import java.util.Arrays;

public class revArr {
    //write a java program that reverses an array
    public static void main(String[] args){
        int[] arr = {25,1,23,53,63,37,758,585,8,3,352};
        int arrLen = arr.length;
        System.out.println("REVERSE OF AN ARRAY");
        System.out.println("Array: "+ Arrays.toString(arr));
        for(int i =0;i < arrLen/2;i++){
                int temp = arr[i];
                arr[i] = arr[arrLen - i-1];
                arr[arrLen-i-1] = temp;
        }
        System.out.println("Reversed Array: "+ Arrays.toString(arr));
    }
}

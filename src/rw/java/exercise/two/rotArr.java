package rw.java.exercise.two;

import java.util.Arrays;

public class rotArr {
    public static void main(String[] args){
        //write a program that rotates an array clockwise once
        int[] arr = new int[]{10,20,30,40,50};

        System.out.println("CLOCKWISE ROTATION OF AN ARRAY");
        System.out.println("Array"+ Arrays.toString(arr));

        int arrLen = arr.length;
        int temp = arr[arrLen-1];
        for(int i = arrLen-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.print("New Array: "+Arrays.toString(arr));
    }
}
